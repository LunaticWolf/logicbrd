package bRD1;

import java.util.Scanner;

public class MaskMain {

public void work(String st)throws Exception{
	try{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Rejection Level");
	String level =sc.next();
	char ch=level.charAt(0);
	switch(ch){
	case 'R' :{
		   Split s = new Split();
			s.split1(st);
			break;
		
	}
	case 'F' :
	{
		   Split s = new Split();
			s.split2(st);
			break;
	}
	default : {
		System.out.println("Enter the Rejection level in R/F");		
		break;
	}	
	}
	}catch(Exception e){
		System.out.println("File doesnot exists");
	}
}
}