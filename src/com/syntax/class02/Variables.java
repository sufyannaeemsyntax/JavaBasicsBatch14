package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "Sufyan";
		String last = " Naeem";
		String grade ="A student";
		String city = "Round Lake";
		String state = ",Illinois";
		String number = "773-251-3978";
		
		System.out.println("My name is " + name + last);
		System.out.println("I am a " + grade);
		System.out.println("I live in " + city + state);
		System.out.println("And my phone number is " + number);
		
		//changes
		
		city = "Denver"; //reassigning 
		state = ",Colorado";
		number = "773-260-7003";
		grade = "B student";
		
		System.out.println("My name is " + name + last);
		System.out.println("I am a " + grade);
		System.out.println("And I moved to " + city + state);
		System.out.println("My new number is " + number);
		
		//Rules for identifiers =names (variables, methods, classes)
		//1. cannot use keywords as identifiers 
		//String new="Hello"; -> error
		
		//2. cannot have spaces in identifiers
		//String last name="Smith";
		
		//3. identifiers cannot start with numbers
		//int 1number=123;
		int number1=123; //number can be anywhere after 1 character
		
		/*4. identifiers cannot contain any special characters
		 * boolean hello!=true;
		 * char #chara='A';
		 * 
		 * except $ or _
		 */
		
		double $price=9.98;
		float _price1=1.99F;
		
		/*
		 * Naming conventions
		 * 
		 * Class should start with uppercase and follow camel casing 
		 * 
		 * variables should start with lowercase and follow camel casing
		 */
		
		String Weather="hot"; //not preferred
		
		String myWeather="cold"; //preferred
		
		

		
		
		
	    
		
		
		
		}

}
