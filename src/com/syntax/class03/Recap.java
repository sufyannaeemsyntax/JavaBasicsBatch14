package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		
		/*
		 * String concatenation helps us combine two a String with any primitive data type together 
		 * 
		 * 
		 */
		
		String firstName="Mina";
		String lastName="Henen";
		String fullName=firstName+ " " + lastName;
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="NewYork";
		String country="USA";
		String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" " +country;
		System.out.println(fullAddress);
		
		String incompleteAddress= houseNo+city; 
		
		String step1="if we subtract 10 from 5 we get=" +10;//result in a string
		System.out.println(step1);
		//String step 2=step1-5 //it is not defined java does not understand what to do when we ask her to 
				//subtract a String from a number it complains
			

		System.out.println("if we subtract 10 from 5 we get= " +(10-5)); 
		
		
	}

}
