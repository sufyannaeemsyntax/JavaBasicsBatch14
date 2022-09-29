package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch 14 is good 1822484!(&#(!$&";
		/*
		 * replace methods replaces one String with another in a String
		 * replaceAll it takes to a pattern and replace all the characters that follow the pattern
		 * 
		 * 
		 */
		System.out.println(str.replace("good", "Excellent"));
		System.out.println(str.replaceAll("[a-z]", ""));
	}

}
