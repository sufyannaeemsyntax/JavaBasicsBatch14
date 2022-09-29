package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str="I love java programming";
		/*
		 * charAt returns us the character at a specific index
		 */
		System.out.println(str.charAt(2));// says which character is on the declared number
		
		for(int i=0; i<str.length(); i++) {
			//if(str.charAt(i)==' ') { this gets rid of the space if needed
				
			System.out.println(str.charAt(i));
		}
		}

	}


