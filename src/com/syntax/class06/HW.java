package com.syntax.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

        /*Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
*if hour between 21-24 --> Night/
*/
       Scanner scanner= new Scanner(System.in);
       System.out.println("What time is it? Use 24 hour format");
       int hour=scanner.nextInt();
       
       if(hour>=1 && hour<=11) {
           System.out.println("Morning");
       }  else if (hour>=12 && hour<=15) {
           System.out.println("Afternoon");
       } else if (hour>=16 && hour<=20) {
           System.out.println("Evening");
       } else if (hour>=21 && hour<=24) {
           System.out.println("Night");
       }
    }

	}
