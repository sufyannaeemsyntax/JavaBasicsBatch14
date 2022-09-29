package com.syntax.class07;

public class DoWhileDemo {

	public static void main(String[] args) {
		
		int num=1;
		
		while(num<=3) {
			
			System.out.println(num + " ");
			num++;
		}
		
		System.out.println("------------");
		
		int num1=1;
		
		do { //condition will go through atleast once even if condition is false
			System.out.println("I am do while loop");
			num1++;
		} while (num1>=3); //then once it is here it will not go further
		
	}
}
