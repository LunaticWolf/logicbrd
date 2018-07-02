package bRD1;

import java.util.ArrayList;
import java.util.Iterator;

public class Validation {
		
		//Validation 1
		ArrayList<String> a= new ArrayList<String>();
		Boolean validCode(String s)
		{
			
			if( (s.length()<=10) && !(s.isEmpty()) )
			{
				
			if(a.size()==0)
				{
				a.add(s);
				return true;
				}
			Iterator i =a.iterator();
				while(i.hasNext())
				{
					if(i.next().equals(s))
						{
						return false;
						}
				}
				a.add(s);
				return true;
			}
			else
				return false;
		}

		//Validation 2
		
			Boolean validName(String s)
			{
			
				if( (s.length()<=30) && !(s.isEmpty())  && (s.matches("[a-zA-Z0-9 ]*") ))			
				{	
					return true;
					
				}
				else 
				{
					return false;
				}
			   
			}
			//Validation 3
			boolean validAddress1(String s)
			{
				if( (s.length()<=100) && (!(s.equals("")) ) && ( s!=null ) )
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
			
			//Validation 4
					boolean validAddress2(String s)
					{
						if( (s.length()<=100) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
				

	         //Validation 5
	                boolean validPinCode(String s)
					{
	                	//String s= Integer.toString(n);
						if( (s.length()==6) && (!(s.equals("")) ) && ( s!=null ) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}

	           //Validation 6
	                boolean validEmail(String s)
					{
	                	final String str= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
						if( (s.matches(str)) && (!(s.equals("")) ) && ( s!=null ) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
					
	            //Validation 7
	                boolean validContactNumber(String s)
					{
	                	//String s= Integer.toString(n);
						if( (s.length()<=20))
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
	                
	                //Validation 8
	                boolean validPrimaryContactPerson(String s)
					{
	                	if( (s.length()<=100) && (!(s.equals("")) ) && ( s!=null ) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
	                
	              //Validation 9
	                boolean validRecordStatus(String s)
					{
	                	if( (s.length()<=1) && ( (s.equals("N")) ||(s.equals("M")) ||(s.equals("D")) || (s.equals("A")) || ( s.equals("R")) ) && (!(s.equals("")) ) && ( s!=null ) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
	                
	                
	                //Validation 10
	                boolean validFlag(String s)
					{
	                	if( (s.length()<=1) && ( (s.equals("A")) || ( s.equals("I")) ) && (!(s.equals("")) ) && ( s!=null  ) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
	                
	              //Validation 11
	                boolean validCreateDate(String s)
	                {
	          					if ( (!(s.equals("")) ) && ( s!=null ) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
	                
	                //Validation 12
	                boolean validCreatedBy(String s)
	                {
	          					if ( (s.length()<=30) && (!(s.equals("")) ) && ( s!=null ) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
	               
	               //Validation for 13 and 15 is not required 
	                
	              //Validation 14 
	                boolean validModifiedBy(String s)
	                {
	          					if ( (s.length()<=30) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
	       
	                //Validation 16
	                boolean validAuthorisedBy(String s)
	                {
	          					if ( (s.length()<=30) )
						{
							return true;
						}
						else 
						{
							return false;
						}
					}
		}