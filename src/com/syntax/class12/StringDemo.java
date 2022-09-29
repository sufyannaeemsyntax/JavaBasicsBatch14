package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
	//Proper way of creating an object	
	 String str = new String("Java");
	 //Simpler and shorter way provided by Java Creators to make our life a little easier
	 String name="My name is Khan Osman"; //only works for String and Wrapper classes
	
	 //Length count the number of characters in a string including the spaces 
	 System.out.println(str.length()); //shows how many letters or characters(char) are in the str variable
	 System.out.println(name.length());
     if(name.length() >15) { //if more than 15 characters in the variable then bottom will print
    	System.out.println("Name can't be more than 15 characters"); 
     }
     
     
     
     
     
     }

}
