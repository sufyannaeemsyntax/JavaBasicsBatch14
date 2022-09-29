package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		
//String is just 1 example of non primitive data types
		
		String name="Sufyan"; 
		String address="123 address street";
		String phone = "123 456 7890";
		int age=20;
		//String age= "20"; //anything you put inside "" becomes string
		
		String character="A";
		//ctr+space -> auto completes the statement
		//syso + ctlr + space
		
		System.out.println(name);
		
		//"My name is" + Sufyan
		System.out.println("My name is " +  name);
		
		// Sufyan is 20
		System.out.println(name + " is " + age);
		
		String fruit="apple";
		double price=1.99;
		System.out.println("The price of the " + fruit + " is " + price);
		
		//The price of the apple is 1.99
		
		fruit="mango";
		price=5.99;
		//The price of the mango is 5.99
		
		System.out.println("The price of the " + fruit + " is " + price);
		
		/*to attach any value(int, double, boolean, char, String etc)
		 * to a String we use +
		 * + next to the String act as concatenation
	     */
		
		
	}

}
