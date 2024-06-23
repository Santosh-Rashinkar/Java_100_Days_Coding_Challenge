package com.prowings.coding.challenge;
//WAP to find the sum of natural numbers using recursion .
public class Day_23 {

	public static void main(String[] args) {

		int number = 20;

		int sum = addNumbers(number);

		System.out.println("Sum :" + sum);

	}

	public static int addNumbers(int num) {

		if (num != 0)

			return num + addNumbers(num - 1);

		else
			return num;
	}

}
