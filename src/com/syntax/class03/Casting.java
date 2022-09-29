package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting =>
		 * converting one data type to another
		 */
		
		byte box1=127; //smallest box 8 bits 
		short box2=3333; //slightly large box(second up) 
		int box3=45454545; //large box most commonly used 
		long box4=45454544; //slightly large box
		float box5=414141447; // larger box
		double box6=575757578; //largest box
		
		int number=(int)15.2; //we can't store the decimal number in a box of type int so 
		                 //only double or float take decimal
		// adding parenthesis of int before the number makes it go through the error
		System.out.println(number);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;

		long box7=box1;// we can do this because box 7 is larger than box 1
		//basically we can not go shorter we can proceed to larger box
		
		//as box 6 is larger it is double we need type casting to assign the value
		float box8=(float)box6; 
		
		char a=(char)67;
		System.out.println(a);
		
		int box9=(int)box4;
				System.out.println(box9);
		
		
		
		

	}

}
