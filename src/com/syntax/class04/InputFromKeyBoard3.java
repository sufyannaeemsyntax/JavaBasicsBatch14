package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard3 {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
	    // we use nextINt() if we want an int type of data from keyboard
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		if(age<18)
		{
			System.out.println("You should study");
		}else {
			System.out.println("You should start working");
		}

	}

}
