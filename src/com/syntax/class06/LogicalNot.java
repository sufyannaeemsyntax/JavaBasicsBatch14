package com.syntax.class06;

public class LogicalNot {

	public static void main(String[] args) {
		
		
		boolean boo=!false;
		System.out.println(boo); //false
		
		boolean boo1=!true;
		System.out.println(boo1); //true
		
		boolean rain=true;
		
		if(!rain) {
			System.out.println("I will go for a walk");
		}
		
		String day="Sunday";
		if(!day.equals("Sunday")){
			System.out.println("Today is not Sunday");
		}
		System.out.println("------------------");
		
		boolean checkboxSelected=false;
		
		if (!checkboxSelected)
		{
			System.out.println("I will click and select it");
		}
		
		System.out.println("End of the program");
		} 
	
	

}
