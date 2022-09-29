package com.syntax.class04;

import java.util.Scanner;

public class InputFromTheKeyboard {

	public static void main(String[] args) {
		
       Scanner scanner=new Scanner(System.in); //variable has to be used on 11
		System.out.println("Please enter any sentence");
		String sentence=scanner.nextLine();//variable used after =
		System.out.println(sentence);

	}

}
