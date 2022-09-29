package com.syntax.class10;

public class Example {

	public static void main(String[] args) {
//enhanced loop
		String[] week= {"Monday", "Sunday","Tuesday","Thursday","Friday"};
		
		//if day is sunday -> it is fun day
		//otherwise- it is boring day
		for(String day:week) {
			
			if(day.equals("Sunday")) {
			System.out.println(day+" is a fun day");
			}else if(day.equals("Friday")) {
				System.out.println(day+ " is jumma");
		}else {
			System.out.println(day+" is a boring day");
		}
		
		
	}
	}
}
