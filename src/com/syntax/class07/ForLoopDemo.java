package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		for (int i=1; i<=5 ; i++) { //print 5 
			

			System.out.println("Hello"); 
			}
		
		System.out.println("----------");
		
		//print numbers from 1 to 20
		 //for (startValue;endValue;increment/decrement)
		//start value is 1
		//end value is 20 
		//going up so will be i++
		
		
		for(int i=1; i<=20; i++) {
			System.out.println(i + " ");
		}
		
		System.out.println("-------------");
		
		//print numbers from 30 to 10
		
		for(int s=30; s>=10; s--) {
			System.out.print(s + " ");
		}
		
		System.out.println("----------");
		
		for (int i=10; i<=25; i+=5) {
			System.out.println(i + " ");
		}
		
		System.out.println("----------");
		
		int sum=0;
		
		for(int i=1; i<=6; i++) {
			
			sum+=i;
		}
		System.out.println(sum);
			
	}
	}
