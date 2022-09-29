package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your Quiz Score?");
		double quiz = input.nextDouble();
		System.out.println("Please Enter your mid term Score?");
		double midterm = input.nextDouble();
		System.out.println("Please Enter your Final Score");
		double Final = input.nextDouble();
		double average;
		String grade = "null"; //null is not needed after grade
		
		average = (quiz+midterm+Final)/3;
		
		if(average>=90&&average<=100) {
			grade = "A";
		} else if ( average>=50 && average<70) {
			grade = "B";
		} else if ( average>=50 && average<70) {
			grade = "C";
		}else if (average<50) {
			grade = "F";
		}else {
			System.out.println("Please enter a valid score!");
			grade="None";
		} // after this because then it will be after if condition also after else, so it all as whole
		System.out.println("Grade: "+grade);
		}
		
		

	}

