package com.prowings.coding.challenge;

// WAP to check if an array contains a given Value.

public class Day_29 {

	public static void main(String[] args) {

		int[] num = { 11, 12, 13, 14, 15 };

		int toFind = 13;

		boolean found = false;

		for (int n : num) {

			if (n == toFind) {
				found = true;
				break;
			}
		}
		if (found)
			System.out.println(toFind + " is Found");
		else
			System.out.println(toFind + "is Not Found");
	}
}
