package com.syntax.class04;

public class NestedifConditions {

	public static void main(String[] args) {
		
		int time=9;
		String day="Monday";
		/*
		 * it is called outer if- condition if it id true then only inner conditions will be checked. 
		 * if it is false nothing from inner if-condition will be executed. It is like the main door
		 *  If main door is closed we can't enter building.
		 */
		// outer if-conditions
		if(day.equals("Monday")) { //as String is a non primitive we can not use == sign we have to use .equals method
			
			//inner if-conditions
			if(time>7) {
				System.out.println("Lets go to office");
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}

	}

}
