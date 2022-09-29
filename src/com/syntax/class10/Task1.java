package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {

		//2.Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
		//Then your program should print name of the students that has A and B grade
		
		
		String[][] arr= {
				{"Sufyan", "Haaris", "Bhai", "Aimun"},
				{"A", "B", "C", "D"}
		};
		System.out.println(arr[0][0]+"="+arr[1][0]); //sufyan=A
		System.out.println(arr[0][2]+"="+arr[1][2]); //bhai=C
		
		System.out.println("----------------------------");
		
		for(int i=0; i<arr.length; i++) { //print all names
			
		for (int j=0; j<arr[i].length;j++)	{ //print all grades
			System.out.println(arr[i][j]);
		}
		
		System.out.println("---------------------------");
		
		for(String[] singArray:arr) { //loop over 1d or single array
			
			for(String el:singArray) {//loops over each emement of the 1d array
				
				System.out.println(el);
			}
			
			
			
		}
		
		
		

		}
		
		
	}
}

