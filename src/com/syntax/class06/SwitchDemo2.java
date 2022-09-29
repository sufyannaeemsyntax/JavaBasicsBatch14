package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
	
		//matching cases must of same date type as a variable in switch\
		//no duplicated case in switch
		//
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y'://char so has to be in ' '
		    answer="Yes"; //String so will be in " "
		    break;
		case 'N':
			answer="No";
			break;
		case'M':
			answer="Maybe";
			break;
			default:
				answer="Unknown";
				break;
				
		}
			 System.out.println(answer);
			 
			 //Limitations of Switch case
			 /* switch case cannot use logical operators like && and ||
			  * switch case cannot use relational operators > < ==
			  * 
			  */
			 
			 /*
			  * Cannot work with boolean values
			  * Compiler Error: Cannot switch on a value of type boolean.
			  * boolean boo=true;
			  
			  switch(boo) { 
			  
			  }
			  
			  
			  CANNOT work with float/double and long
			  */
		
		}
	

}
