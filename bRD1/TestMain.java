package bRD1;
								//D:/BRD-File Upload/Test Cases
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class TestMain{

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File path");
		String sP =sc.nextLine();
		System.out.println("Enter the file name");
		String sN =sc.next();
		String str=sP+"/"+sN;
		MaskMain m = new MaskMain();
		if(sN.endsWith("txt"))
				{
			m.work(str);
				}
				
		else{
				System.out.println("Wrong File Format");
		
		}
		
	
	}
}
