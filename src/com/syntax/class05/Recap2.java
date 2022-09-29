package com.syntax.class05;

public class Recap2 {
/*
 * ctrl + shift + f shortens everything in the code
 * 
 * 
 */
	public static void main(String[] args) {


		boolean allergy = false;
		String allergyType = "Peanut";

		if (allergy) {

			System.out.println("Let's check what allergy you have");
		}
		if (allergyType.equals("Pollen")) {
			System.out.println("Try to stay indoor when trees are crazy");
		} else if (allergyType.equals("Peanut")) {
			System.out.println("Stay away from nuts");
		} else if (allergyType.equals("Dairy")) {
			System.out.println("Stay away from milk");
		} else {
			System.out.println("You are such a lucky guy");
		}

	}
}
