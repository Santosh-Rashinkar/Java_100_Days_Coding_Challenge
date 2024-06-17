package com.prowings.coding.challenge;

import java.util.Scanner;

// WAP to check palindrome .

public class Day_17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number ");

		int num = scan.nextInt();
		int r = 0;
		int x = num;
		while (num != 0) {
			int d = num % 10;
			r = r * 10 + d;
			num /= 10;
		}
		if (x == r) {

			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
		scan.close();
	}

}
