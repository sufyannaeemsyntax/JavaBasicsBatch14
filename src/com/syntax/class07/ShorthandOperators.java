package com.syntax.class07;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		int i=10;
		
		i=i+9;
		
		System.out.println(i); //19
		
		i=i-5;
		System.out.println(i);//14
		
		i=i*2;
		System.out.println(i); //28
		
		int a=10;
		
		a+=9;       //a+=9; is same as i=i+9;
		System.out.println(a);//19
		
		a-=5; //a is being subtracted by 5 and then gets equaled to the difference
		System.out.println(a); //14
		
		a*=2;
		System.out.println(a);//28           Code is done from 10 to bottom value of a changes each print
		
		a-=10;
		System.out.println(a); //18
		
		a%=4;
		System.out.println("Value after mod operation=" +a);//2
		
		a*=10;
		System.out.println(a);//20
		
		a+=1;
		System.out.println(a);
		
		
		
		
		
		
		
	}

}
