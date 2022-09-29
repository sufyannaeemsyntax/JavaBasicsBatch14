package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String answer;
		
		do {
		System.out.println("Did you get a job");
		 answer=in.next(); //no until yes
		 
		}while(!answer.equals("yes")); //once yes is said it ends
		
		System.out.println("Congrats");
		
		
	}
}
