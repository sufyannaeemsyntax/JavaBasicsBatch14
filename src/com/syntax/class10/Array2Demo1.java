package com.syntax.class10;

public class Array2Demo1 {

	public static void main(String[] args) {
		
		
		String[] individualsinRoom1= new String[] {"Sabej","Sufyan","Elizabeth"};
		String[] individualsinRoom2= new String[] {"Roman","Shah","Mina"};
		String[] individualsinRoom3= new String[] {"Asad","Priyasri","Ali"};
		
		String[][] rooms=new String[3][]; //since you will be storing 3 individual arrays
		rooms[0]=individualsinRoom1;
		rooms[1]=individualsinRoom2;
		rooms[2]=individualsinRoom3;
		
		System.out.println(rooms[1][2]); //[] is the row [] is the column start from 0
		
		
		System.out.println("-------------------");
		
	}
}
