package com.syntax.class09;

public class ArrayFixedSize {

	public static void main(String[] args) {

		int[] nums= new int[3]; //array starts from 0, so if printing 0 then will be 0
		nums[1]=12;
		nums[2]=13;
		System.out.println(nums[0]);
		
		
		
		String[] colors=new String[3]; //you cannot have 3 array colors so no colors[3]=
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		//colors[3]="Yellow"; //Array out of bounds
		
		//System.out.println(colors[3]);
	
		
		
		
	}

}
