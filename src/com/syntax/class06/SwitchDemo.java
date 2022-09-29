package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		//if statement is conditional based
		//it executes block of code based on true or false
int day=6;
		
		if(day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if(day==4) {
			System.out.println("Thursday");
		}else if(day==5) {
			System.out.println("friday");
		}else if (day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else { // else block has to be last
			System.out.println("Please enter a valid day number(1-7)");
		}
		System.out.println("--------------");
		
		String name;
		
		//switch case is values based
		//it knows the values -> jump into matching case
		switch(day) {
		
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6:
			name="Saturday";
		case 7:
			name="Sunday";
			break;
			default: //you can put default in the very beginning
				name="Invalid";
				break; //default does not need a break
		}
		System.out.println(name);
		
		
		}
		
	}

