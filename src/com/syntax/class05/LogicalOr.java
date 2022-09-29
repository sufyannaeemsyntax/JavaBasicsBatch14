package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="friday";
		
		if(day.equals("saturday") || day.equals("sunday")) {
			System.out.println("I have Java  class at syntax LogicalOr");
		}
	if (day.equals("saturday") && day.equals("sunday")) { // this will not print because there is one string 
		System.out.println("I have java class at syntax logicalAnd");
	}
	System.out.println("-------------------");

	double money=90000;
			String title="Automation Tester";
			
			if(title.equals("Automation Tester") || money ==120000) { // if money is not same but string is you still happy
				System.out.println("Happy");
			}
	
	
	
		{
		}
	}

}
