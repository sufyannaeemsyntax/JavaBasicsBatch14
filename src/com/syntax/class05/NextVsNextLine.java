package com.syntax.class05;

import java.util.Scanner;

public class NextVsNextLine {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);	
    System.out.println("Enter full name");
    
    String name=scan.nextLine(); //prints out the whole line so first and last name and prints TWO or More WORDS
    System.out.println(name);
	}

}
