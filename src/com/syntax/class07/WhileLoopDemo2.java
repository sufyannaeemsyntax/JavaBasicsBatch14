package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		
		// print all numbers from 1 to 10
		
		
  int num=1;
  
  while (num<=10) {
	  
	  System.out.print(num+" ");
	  num++;
  }
  
  System.out.println("---------------");
  
  //print all numbers from 10 to 25
  
  int a= 10;
  
  while (a<=25) {
	  System.out.print(a + " ");
	  a++;
		}
  System.out.println("-----------");
  
  //print all numbers from 10 to 1
  
  int b=10;
  
  while(b>=1) {
	  
	  System.out.print(b+ " ");
	  b--;
  }
  
  //print all numbers from 50 to 20
  int c=50;
  
  while (c>=1) {
	  System.out.println(c+ " ");
	  c--;
  }
  
  //print all even numbers from 1 to 20
  int d=2; {
	  
	  while (d<=20) {
		  System.out.print(d + " ");
		  d+=2;  //d will keep adding to 20 until it is 20 and stay even
		  
	  }
	  //Another way
	  
	  System.out.println("Another way");
	  int i = 1;
	  
	  while (i <= 20) {
		  
		  if (i% 2 ==0) {
		  
	
		  System.out.print(i + " ");
	  }  
	  i++;  //has to be after bracket since if statement is false, if teue can be in bracket
	  
  }
  
  
  
  
	}
	}
}
