package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Olena";
		String lastName="Dudka";
		//to combine
		System.out.println(firstName+lastName);//Mostly this is used
		//or
		System.out.println(firstName.concat(lastName));//barely used
		
		String str="";
		/*
		 * isEmpty() returns true if a String is empty this method will return false even if you have a space in a String variable
		 * however the isBlank methodes does not count the spaces
		 */
		System.out.println(str.isEmpty());
		//System.out.println(str.isBlank()); error because latest java is not updated
	}
	

}
