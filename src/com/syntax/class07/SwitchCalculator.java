package com.syntax.class07;

import java.util.Scanner;
public class SwitchCalculator {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		double num1 = in.nextInt();
		System.out.println("Enter 2nd Number");
		double num2 = in.nextDouble();
		
		System.out.println("Enter the operator you want to use");
		char operator = in.next().charAt(0);
		
		double result=0;
	
		switch (operator) {
		
		case '+' :
			result = num1+num2;
			break;
		
		case '-': 
			result = num1 -num2;
			break;
		
		case '*':
		   result = num1*num2;
		   break;
		
		case '/':
			result =num1/num2;
			break;
			
		}
		
			System.out.println(result);

	}
	
	
		
		
		
		
	}


