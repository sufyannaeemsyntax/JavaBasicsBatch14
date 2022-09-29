package com.syntax.class07;

import java.util.Scanner;

public class JobWithWhileLoop {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
				String answer;
		
		System.out.println("Did you get a job");
		answer = in.nextLine();
		
		while(!answer.equals("yes")) {
			System.out.println("Did you get a job");
			answer = in.nextLine();  //if this is not here then it will be infinite once answer is there 
			 //DO WHILE IS BETTER
		}

	}

}
