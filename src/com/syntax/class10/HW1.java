package com.syntax.class10;

public class HW1 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number
		
		int[] num= {10,20,30,40,50};
		int largestnum=0; //assuming first number is the first element of 10
		
		for (int n:num) { 
			if(n > largestnum) { //it will keep replacing with a bigger number for n moving right
				largestnum=n;
			}
		}
		
		
		
		
		
		
		
		
		
		System.out.println(largestnum);
		
		System.out.println("------------------------");
		
		largestnum= num[0];
		
		for(int i = 1; i<num.length; i++) {
			
			if(num[i]>largestnum) {
				largestnum=num[i];
			}
		}
		System.out.println(largestnum);
	}
	
	

}
