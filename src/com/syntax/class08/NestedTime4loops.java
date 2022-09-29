package com.syntax.class08;

public class NestedTime4loops {

	public static void main(String[] args) {
		//Nested loop time 00:00 with two loops 
		
		for (int h = 0; h <= 23; h++) { //begin the hour
			for (int m = 0; m <=59; m++) { //will get in double digit till 59
				if(m>=0 && m <=9) { // will start from minutes till 9
						if (h>=0 && h<=9) {
						System.out.println("0" + h + ":" + "0" + m);
					}else {
						System.out.println(h + ":" + "0" + m);
					}
				} else if (h >=0 && h<=9) {
					System.out.println("0" + h + ":" + m);
				} else
					System.out.println(h + ":" + m);
			
				
				
				}
			}
		}
	}


