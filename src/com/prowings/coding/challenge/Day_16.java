package com.prowings.coding.challenge;

import java.util.Scanner;

// WAP Reverse the Number using Scanner class .  
public class Day_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter a number : ");
	
		int num1 = scan.nextInt();
		int reverse =0;
		while(num1 != 0) {
			int digit = num1 %10;
			reverse = reverse *10+digit;
			num1/=10;
		}
		System.out.println("Reverse number is :"+reverse);
	}
}
