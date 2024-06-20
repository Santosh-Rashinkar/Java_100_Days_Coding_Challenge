package com.prowings.coding.challenge;

// WAP to to display factors of a number .
import java.util.Scanner;

public class Day_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number to find it's factors: ");

		int number = scan.nextInt();

		displayFactors(number);

		scan.close();
	}

	public static void displayFactors(int number) {

		System.out.println("Factor Of " + number + "are");

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}

	}
}
