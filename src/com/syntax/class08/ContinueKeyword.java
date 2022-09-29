package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			
			if (i==3) { //this number will be skipped and then the number or name after will be output
			continue;
			}
			System.out.println("Hello");
			System.out.println("How are you");
			System.out.println(i);
			
		}

		// I want to print numbers from 1 to 20 except number 6,7 and 8
		
		for(int i=1; i<=20; i++) {
			
			if(i==6 || i==7 ||i==8) {
				continue; //continue means to skip that number
			}
			System.out.println(i + " ");
		}
		
		//continue - continues to the next iteration/cycle 
		//moment java usually sees continue -> it goes back to the beginning of the loop
		//it usually used inside some type of conditions
	}

}

