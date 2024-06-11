package com.prowings.coding.challenge;

// WAP Print number is Positive / Negative
import java.util.Scanner;

public class Day_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		double num = scan.nextDouble();
		scan.close();
		if(num > 0.0) {
			System.out.println("Number is Positive ");
		}
		else if (num == 0.0) {
			System.out.println("Number is Zero");
		}
		else {
			System.out.println("Number is Negative");
		}
	}
}
