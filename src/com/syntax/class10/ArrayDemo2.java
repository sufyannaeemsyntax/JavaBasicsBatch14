package com.syntax.class10;

import java.util.Arrays;

public class ArrayDemo2 {
public static void main(String[] args) {
	
	
	String[] dresses=new String[] {"Pink Dress","Summer dress","Job interview dress", "night dress"};
	//last index is always size -1 because arrays
	//index start from zero
	System.out.println(dresses.length); //length shows all the dresses
	for(int i=0;i<dresses.length;i++) { //this tells you how many dresses you have 
		System.out.println("Lets try "+dresses[i]); //prints all dresses
	}
	System.out.println("-----------------------------------------------------"); 
	//enhanced for loop
	for(String dress:dresses) {
		System.out.println(dress); //prints all dresses
	}
	System.out.println("-----------------------------------");
	//Prints all the elements of an array without a loop in [ ]
	System.out.println(Arrays.toString(dresses));
}
}
