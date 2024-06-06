package com.prowings.coding.challenge;

import java.util.Scanner;

// WAP Addition of two integer using scanner .

public class Day_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a two number : ");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a + b;

		System.out.println("Addition of two integer :" + c);

		scan.close();

	}
}
