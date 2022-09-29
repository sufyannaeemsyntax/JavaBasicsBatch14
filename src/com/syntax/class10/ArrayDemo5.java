package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the number of dresses you want to buy");
		int NoOfDresses=scanner.nextInt();
		
		double[] prices=new double[NoOfDresses];
		
		for(int i=0; i<NoOfDresses;i++) {
			System.out.println("Please enter the price of dress no "+(i+1));
			prices[i]=scanner.nextDouble();
		}
		System.out.println(Arrays.toString(prices));
		
		//Limitations of enhanced for loop
		//we can only go in one direction
		//we can not skip the elements
		//we can not use enhanced for loop to update the elements in an array
		//we can only use it to access the elements
		
		double sum=0;
		for(double price:prices) {
			sum+=price; //sum=sum+price   is another way to type this 
		}
		System.out.println("Total for all the dresses + "+sum);
		
		
		
		
		
		
		
		
		

	}

}
