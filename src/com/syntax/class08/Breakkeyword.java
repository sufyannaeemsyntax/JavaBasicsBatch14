package com.syntax.class08;

public class Breakkeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			System.out.println("Hello");
			
			if(i==3) {
			break;
		}
		}
		
		//break - break the loop and it usually used inside some type of condition
		
		boolean hungry=true;
		
		while(hungry) {
			System.out.println("Give me food");
			break;  //If break is not here then it will keep looping infinite amounts
		}
		
		System.out.println("End");
	}

}
