package com.prowings.coding.challenge;

import java.util.Arrays;

// WAP to concatenate Two Arrays .

public class Day_28 {

	public static void main(String[] args) {
		int [] array1 = { 1, 2, 4, 5, 7, 10};
		
		int [] array2 = {3, 20, 30, 40, 50,60};
	
		int a =array1.length;
		int b =array1.length;
		
		int [] result = new int [a+b];
		System.arraycopy(array1, 0, result, 0, a);
		System.arraycopy(array2, 0, result, a, b);
	    System.out.println("This is marge array : "+Arrays.toString(result));
	
	}
	
	
}
