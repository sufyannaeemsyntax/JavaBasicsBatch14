package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		/*we need to ask a user where he or she is from 
		 *  based on the country - defines favorite food
		 */
		
		Scanner in= new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		String country=in.nextLine();
		String favoriteFood;
		
		switch(country) {
		
		case "usa":
			favoriteFood="burgers and fries";
			break;
		case "Pakistan":
			favoriteFood="Biryani";
			break;
		case "Turkey":
			favoriteFood="anada kebab";
			break;
		case "Venezuela":
			favoriteFood="arepa";
			break;
		case "India":
			favoriteFood="Butter Chicken";
			break;
		case "Afghanistan":
			favoriteFood="Palow";
			break;
			default:
				favoriteFood= "Unknown";
				break;
				
		}
		System.out.println("You are from "+country+ " and your favorite food is " + favoriteFood);
	}

}
