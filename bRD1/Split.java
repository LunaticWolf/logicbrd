package bRD1;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
public class Split extends Customer  {
	static int id=10, eid=0;
	String s2[];
	ArrayList<String> s3 =new ArrayList();
	ArrayList a1 = new ArrayList();
	ArrayList a2 = new ArrayList();
	Validation v= new Validation();
	Customer c = new Customer();
	Database db = new Database();
	int aa=0;
	void split1(String st1)throws Exception
	{
		FileReader f1=new FileReader(st1);
		OutputStream os =new FileOutputStream("C:/Documents and Settings/temp/Desktop/testCase1.txt");	
		BufferedReader br=new BufferedReader(f1);
		String rd;	
		while((rd=br.readLine())!=null)
		{
			s3.add(aa, rd);		
			aa++;	
		}		
		String[] stockArr = new String[s3.size()];
		stockArr = s3.toArray(stockArr);		
		for(String sA : stockArr){		
			s2=sA.split("~",16);		
			for(int i=0;i<s2.length;i++){				
				if(i%16==0 || i==0){
					if(v.validCode(s2[i]) && v.validName(s2[i+1]) && 
							v.validAddress1(s2[i+2]) && v.validAddress2(s2[i+3]) &&
							v.validPinCode(s2[i+4]) && v.validEmail(s2[i+5]) && 
							v.validContactNumber(s2[i+6]) && 
							v.validPrimaryContactPerson(s2[i+7]) && 
							v.validRecordStatus(s2[i+8])  &&  v.validFlag(s2[i+9]) && 
							v.validCreateDate(s2[i+10]) && v.validCreatedBy(s2[i+11]) &&
							v.validModifiedBy(s2[i+13]) && v.validAuthorisedBy(s2[i+15]))
					{							
						Customer c1 =new Customer(s2[i],s2[i+1],s2[i+2],s2[i+3],
								s2[i+4],s2[i+5],s2[i+6],s2[i+7],s2[i+8],s2[i+9],s2[i+10],
								s2[i+11],s2[i+12],s2[i+13],s2[i+14],s2[i+15]);						
						db.insertDB(c1,id);
						this.id=eid++;
					}
					else
					{					
						a2.add(new Customer(s2[i],s2[i+1],s2[i+2],s2[i+3],s2[i+4],s2[i+5],
								s2[i+6],s2[i+7],s2[i+8],s2[i+9],s2[i+10],s2[i+11],s2[i+12],
								s2[i+13],s2[i+14],s2[i+15],"invalid"));
					}
				}
			}
		}
		Iterator i2 = a2.iterator();
		while(i2.hasNext()){
			String c = i2.next().toString();
			byte b1[]=c.getBytes();
			for(int i= 0;i<b1.length;i++){
				os.write(b1[i]);
			}
		}
		System.out.println("Full data Has been stored in database");
		System.out.println("Invalid entries are stored in file:-");
		System.out.println("file Path:-D:/sagar/InvalidRecords.txt");
	}
	void split2(String st1)throws Exception
	{
		FileReader f1=new FileReader(st1);
		OutputStream os =new FileOutputStream("C:/Documents and Settings/temp/Desktop/testCase1.txt");		
		BufferedReader br=new BufferedReader(f1);
		String rd;		
		while((rd=br.readLine())!=null)
		{
			s3.add(aa, rd);		
			aa++;			
		}		
		String[] stockArr = new String[s3.size()];
		stockArr = s3.toArray(stockArr);		
		for(String sA : stockArr){		
			s2=sA.split("~",16);		
			for(int i=0;i<s2.length;i++){	
				if(i%16==0 || i==0){
					if(v.validCode(s2[i]) && v.validName(s2[i+1]) && v.validAddress1(s2[i+2]) && 
							v.validAddress2(s2[i+3]) && v.validPinCode(s2[i+4]) && 
							v.validEmail(s2[i+5]) && v.validContactNumber(s2[i+6]) && 
							v.validPrimaryContactPerson(s2[i+7]) && v.validRecordStatus(s2[i+8])  && 
							v.validFlag(s2[i+9]) && v.validCreateDate(s2[i+10]) && 
							v.validCreatedBy(s2[i+11]) && v.validModifiedBy(s2[i+13]) && 
							v.validAuthorisedBy(s2[i+15]))
					{						
						a1.add(new Customer(s2[i],s2[i+1],s2[i+2],s2[i+3],s2[i+4],s2[i+5],
								s2[i+6],s2[i+7],s2[i+8],s2[i+9],s2[i+10],s2[i+11],s2[i+12],
								s2[i+13],s2[i+14],s2[i+15],"valid"));									
					}
					else
					{						
						a2.add(new Customer(s2[i],s2[i+1],s2[i+2],s2[i+3],s2[i+4],s2[i+5],
								s2[i+6],s2[i+7],s2[i+8],s2[i+9],s2[i+10],s2[i+11],s2[i+12],
								s2[i+13],s2[i+14],s2[i+15],"invalid"));	
					}
				}
			}
		}
		if(a2.isEmpty()){
			Iterator i1 = a1.iterator();
			while(i1.hasNext()){
				db.insertDB((Customer)i1.next(),id);
				this.id=eid++;
			}
			System.out.println("Data successfully stored in database!!");
		}
		else{
		Iterator i1 = a1.iterator();
		while(i1.hasNext()){
			String c1 = i1.next().toString();
			byte b1[]=c1.getBytes();
			for(int i= 0;i<b1.length;i++){
				os.write(b1[i]);
										}
							}
		Iterator i2 = a2.iterator();
		while(i2.hasNext()){
			String c2 = i2.next().toString();
			byte b2[]=c2.getBytes();
			for(int i= 0;i<b2.length;i++){
				os.write(b2[i]);										}
							}
		System.out.println("Data couldnot be stored in databse since there were invalid entries");
		System.out.println("View All the valid and invalid entries here");
		System.out.println("File Path:-D:/sagar/InvalidRecords.txt");
		}
	}
}	