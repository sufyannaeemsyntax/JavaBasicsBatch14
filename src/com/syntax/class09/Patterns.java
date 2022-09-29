package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) { //outer loops take cares of rows
			for(int j=1; j<=3; j++) { //inner loop take cares of columns
			System.out.print("* ");
		}
		System.out.println();
	}
//  * * * 
//	* * * 
//	* * * 
//	* * *
		System.out.println("-------------------------");
		for(int i=1; i<=4; i++) { //rows
			for(int j=1; j<=5; j++) { //columns
			System.out.print(j+" ");
	}
			System.out.println();
			
}
		
	}
}
