package com.prowings.coding.challenge;
// WAP to Generate Multiplication Table .

import java.util.Scanner;

public class Day_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		scan.close();
		for (int i = 1; i <= 10; i++) {

			System.out.printf("%d * %d=%d /n", num, i, num * i);
		}
	}

}
