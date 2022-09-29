package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
	
for(int i=1; i<4; i++) {
	for(int j=0; j<=2; j++) {
		System.out.println("Hello");
		break;//if not break, hello prints 3 times, bye once
		
	}
	System.out.println("Bye");
break; //only hello bye, if no break then hello bye times 3
}
		System.out.println("----------------------------------");
	
		boolean day=true;
		
		for(int i=1; i<=3; i++) {
			
			while(day) { //means as long as condition is true with boolean
				System.out.println("Good Day"); //unlimited good day
			}
			
		}
		
		
		
		
	}

}
