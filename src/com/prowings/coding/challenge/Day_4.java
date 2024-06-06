package com.prowings.coding.challenge;

// WAP to find a largest and smallest number., out of 3 "withaut using if...else" .

public class Day_4 {

	public static void main(String[] args) {
		
		int a = 5;
		
		int b = 8;
		
		int c = 9;
		
		int d = Math.min(a, Math.min(b,c));
		
		System.out.println("smallest number : " +d);
	}
}