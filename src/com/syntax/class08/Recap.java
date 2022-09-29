package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
/*
 * Prompt the user to task the name 3 times and print "Good afternoon + name
 * 
 * 
 */
		Scanner in = new Scanner(System.in);
		
		for (int i =1; i<=3; i++) {
			
			
			System.out.println("Please write a name");
			String name = in.nextLine();
			
			System.out.println("Good afternoon " + name);
			System.out.println("------------");
		}
		
	}

}
