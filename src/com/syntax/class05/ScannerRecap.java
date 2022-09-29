package com.syntax.class05;

import java.util.Scanner;
//ctrl shift o    makes this an import (shortcut)
public class ScannerRecap {

	public static void main(String[] args) {

		int i = 10; //i variable 
		String str = "Hello"; //str variable 

		Scanner input = new Scanner(System.in); //input variable
		System.out.println("Please enter your name");
		
		//to capture different values we need to use different options
		String name = input.next(); //capturing String
		System.out.println("Nice to meet you " + name);
		
		System.out.println("How old are you " + name);
		int age=input.nextInt(); //capturing int
		System.out.println(name + " is " +age+ " years old");
		
		
		System.out.println("How much money you have " +name);
		double money = input.nextDouble();
		
		System.out.println(name + " has $ " +money);
		
		System.out.println(name+ " what is your grade");
		char grade = input.next().charAt(1);
		/*when executed (1) so the second number from left will be used
		*so if "abc" then b will be executed
		*/
		
		
		System.out.println("End");
		

		
	}

}
