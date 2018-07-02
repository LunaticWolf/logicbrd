package bRD1;

import java.sql.*;

public class Database {

	

	public Connection con=null;
	PreparedStatement pst= null;
	public void getCon() {
	try{

		//Class.forName("com.mysql.jdbc.Driver");  
		 ///con=DriverManager.getConnection(  
		//"jdbc:mysql://localhost:3306/s_cust","root","");  
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con= DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl","sh","sh");

	}catch(Exception e){
	System.out.println("In connection");
	e.printStackTrace();
	}

	}

	public void setCon(Connection con) {
	this.con = con;
	}

	void closeCon(){
	try{
	con.close();		
	}catch(Exception e){}
	}

	public void insertDB(Customer c,int id) {
	// TODO Auto-generated method stub
	getCon();
		
	try{
		String sql = "Insert into Shubham_Customer_Master values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		 pst= con.prepareStatement(sql);

	pst.setInt(1,id);
	pst.setString(2,c.getCode());
	pst.setString(3,c.getName());
	pst.setString(4,c.getAddress1());
	pst.setString(5,c.getAddress2());
	pst.setString(6,c.getPincode());
	pst.setString(7,c.geteMail());
	pst.setString(8,c.getContactnumber());
	pst.setString(9,c.getContactnumber());
	pst.setString(10,c.getRecordStatus() );
	pst.setString(11,c.getFlag());
	pst.setString(12,c.getCreateDate());
	pst.setString(13,c.getCreatedBy());
	pst.setString(14,c.getModifiedDate());
	pst.setString(15,c.getModifiedBy());
	pst.setString(16,c.getAuthorisedDate());
	pst.setString(17,c.getAuthorisedBy());
	int x=pst.executeUpdate();
	

	//con.commit(); // needed to comment
	System.out.println("Record Inserted:OK ");
	}catch(Exception e){
	System.out.println("inside insert catch");
	e.printStackTrace();
	}
	}

}
