// WAP to check whether a number is Even or Odd .
package com.prowings.coding.challenge;

import java.util.Scanner;

public class Day_7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");

		int a = scan.nextInt();

		if (a % 2 == 0) {

			System.out.println("It is a even number ");
		} else {
			System.out.println("It is a odd number ");
		}
		scan.close();

	
	}
}
