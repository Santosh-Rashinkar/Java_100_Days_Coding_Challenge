package com.prowings.coding.challenge;

import java.util.Scanner;

// WAP to check whether a number is Prime or Not
public class Day_18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();

		isPrimeSimple(number);

		scan.close();
	}

	public static void isPrimeSimple(int number) {
		if (number <= 1) {
			System.out.println(number + " is not a prime number.");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println(number + " is not a prime number.");
				return;
			}
		}
		System.out.println(number + " is a prime number.");
	}
}