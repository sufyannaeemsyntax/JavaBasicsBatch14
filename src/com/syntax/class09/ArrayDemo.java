package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] i=new int[4];
		//store elements inside an array
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;

		//accessing elements from the array
		System.out.println(i[2]); //30
		System.out.println(i[1]+i[2]); //50 sum
		
		//lets create an array and store your classmates
		String[] names=new String[5]; //string due to names
		names[0]="Shah";
		names[1]="Vera";
		names[2]="Roman";
        names[3]="Anthony";
        names[4]="zaza";
        
        System.out.println("Hello "+names[1]); //Hello Vera
	}

}
