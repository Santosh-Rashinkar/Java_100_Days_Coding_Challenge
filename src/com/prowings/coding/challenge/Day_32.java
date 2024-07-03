package com.prowings.coding.challenge;

//WAP to Sort Array in Ascending order.

import java.util.Arrays;

public class Day_32 {

	public static void main(String[] args) {
		
		int [] array = {12,16,18,20,22,40,8,67,47,86,25};
		
		Arrays.sort(array);
		
		for(int a : array) {
			
			System.out.println(a);
		}
		
	}
}
