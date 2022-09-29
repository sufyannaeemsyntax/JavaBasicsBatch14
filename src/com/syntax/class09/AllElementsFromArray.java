package com.syntax.class09;

public class AllElementsFromArray {

	public static void main(String[] args) {

		String[] iceCream= {"vanilla", "chocolate", "pistachio", "kulfi"};
		
		System.out.println(iceCream[0]);//vanilla
		System.out.println(iceCream[1]);//chocolate
		
		
		//how to get all values?
		
		for(int i=0; i<iceCream.length;i++) {
			
			System.out.println(iceCream[i]);
		}
		
		System.out.println("--------------------------");
		
		char[] letters= {'A','B','C','D'};
		
		for(int i=0; i<letters.length;i++) { //.length makes it do all of them
			System.out.print(letters[i]+ " ");
		}
		
	}

}
