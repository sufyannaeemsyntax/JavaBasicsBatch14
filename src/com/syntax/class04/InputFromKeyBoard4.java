package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard4 {

	public static void main(String[] args) {
		

		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter your name");
		//takes a String type input from the keyboard and stores it in name 
		//variable
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		//takes an int from the keyboard and stores it in age variable
		int age=scanner.nextInt();
		
		System.out.println("Hi "+name+" you are "+age+" years old");
		
		
	}

}
