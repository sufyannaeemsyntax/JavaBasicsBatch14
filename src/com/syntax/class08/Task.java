package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//1 from the range of 1 to 50 
		//please find the sum of all even and all odd numbers
		
		int sumE = 0;
		int sumO = 0;
		
		for (int i=2; i<=50; i+=2) {
			sumE +=i;
		}
		
		System.out.println("Sum of Even number (between 1 to 50) " + sumE);
		
		for (int i = 1; i <=49; i+=2) {
			sumO += i;
		}
		System.out.println("Sum of Odd number (between 1 to 50): " + sumO);
		
		
		/*2
		 * create a secret number and let user guess the secret number 
		 * once user guessed your secret number -> program says you won!
		 */

		Scanner in = new Scanner(System.in);
		int secret = 1234;
		int guess;
		
		do { 
			System.out.println("Please guess the secret number: ");
			guess=in.nextInt();
			
		}while(guess != secret);
		
			System.out.println("You won!");
	}
		
	
	}


