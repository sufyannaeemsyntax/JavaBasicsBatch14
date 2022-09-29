package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
	
		String str=" i love java";
		System.out.println(str);
		/*
		 * Remove the spaces before and after the String 
		 * but not the ones which are present in between
		 */
		System.out.println(str.trim()); //" I love java" to "I love java"
        
		String str2= " Java is Very easy";
		/*
		 * startswith= checks if a string starts with a specific letter or word
		 * endswith= checks if a string ends with a specific letter or word
		 * contains= checks if a string contains a specific letter or word
		 */
		System.out.println(str2.startsWith(" Java"));//to see if the beginning the starts with this and will result is t/f
		System.out.println(str2.endsWith("y")); //to see ending
		
		System.out.println(str2.toLowerCase().contains("very")); //method chaining helps us call multiple methods single line
		System.out.println(str2.contains("very")); //to see middle
	}

}
