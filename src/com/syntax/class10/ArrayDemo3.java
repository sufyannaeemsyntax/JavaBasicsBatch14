package com.syntax.class10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {

		
		double size=10;
		int[] arr=new int[10];
		//arr[0]=10;
		//arr[1]=10;
		//arr[2]=10; retarded way
		
		//easy way
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=20;
		}
		System.out.println(Arrays.toString(arr));
	}
}
