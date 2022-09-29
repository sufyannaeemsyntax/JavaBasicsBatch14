package com.syntax.class07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		double num1 = in.nextInt();
		
		System.out.println("Enter 2nd Number");
		double num2 = in.nextInt();
		
		System.out.println("Enter the operator");
		String oper=in.nextLine();
		char op = in.next().charAt(0);
	
		double result=0 ;
		
		if (op == '+')  {
			result = num1+num2;
		}
		else if (op == '-') {
			result = num1 -num2;
		}
		else if (op== '*') {
		   result = num1*num2;
		}
		else if (op == '/') {
			result =num1/num2;
		}
		else {
			System.out.println("enter valid operator");
		}
		if(result !=0.0 ) {
		System.out.println(result);

	}
	}
}

