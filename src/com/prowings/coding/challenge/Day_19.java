package com.prowings.coding.challenge;

import java.util.Scanner;

//WAP to check Armstrong Number using Scanner .

public class Day_19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int number = scan.nextInt();

		checkArmstrong(number);
		scan.close();
	}

	public static void checkArmstrong(int number) {

		int originalNumber = number;
		int sum = 0;
		int digits = 0;

		for (int temp = number; temp > 0; temp /= 10) {
			digits++;
		}
		for (int temp = number; temp > 0; temp /= 10) {
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
		}

		if (sum == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number.");
		} else {
			System.out.println(originalNumber + " is not an Armstrong number.");
		}
	}

}