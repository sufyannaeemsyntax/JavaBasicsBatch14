package com.syntax.class02;

public class HomeworkJavaClass2 {

	public static void main(String[] args) {
//1
 double a=5.50;
 double b=2.25;
 
 double add=a+b;
 double subtract=a-b;
 double multiply=a*b;
 double divide=a/b;
 
 System.out.println("The addition of 2 numbers " + a + " and " + b + " is equal to " + add);
 System.out.println("The subtraction of 2 numbers  " + a + " and " + b + " is equal to " + subtract );
 System.out.println("The multiplication of 2 numbers " + a + " and " + b + " is equal to " + multiply );
 System.out.println("The division of 2 numbers " + a + " and " + b + " is equal to " + divide);
 //2
 double num=3.9;
 double square= 3.9*3.9;
 
 System.out.println("The square of the number " + num + " is " +square);
 //3
 
 int width=5;
 int height=8;
 int perimeter= (width + height)*2;
 int area= width*height;
 
 System.out.println("The perimeter of a rectangle with a width of " + width + " and height of " + height + " is equal to " + perimeter + " and the area is " + area);
	

	}

}
