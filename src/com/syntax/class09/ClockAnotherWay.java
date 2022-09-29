package com.syntax.class09;

public class ClockAnotherWay {

	public static void main(String[] args) {
		
		for(int h1=0; h1<=2; h1++) { //hour  00,10,20
			for(int h2=0; h2<=9;h2++) { //hour 09,19,
				if(h1==2 && h2==4) { //after 20 and after 24 the clock ends from break
					break; 
				}
				for (int m1=0; m1<=5; m1++) { //minute 10-50
					for(int m2=0; m2<=9; m2++) {//minutes 0-9
						System.out.println(h1+""+h2+":"+m1+""+m2);
					}
				}
			}
		}

	}

}
