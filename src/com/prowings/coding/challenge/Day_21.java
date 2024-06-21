package com.prowings.coding.challenge;

// WAP to convert Binary Number to Decimal and vice-versa .

public class Day_21 {

	public static void main(String[] args) {

		long number = 110110111;

		int decimal = convertBinaryToDecimal(number);

		System.out.println("Binary to Decimal");
		System.out.println(number + " = " + decimal);
	}

	public static int convertBinaryToDecimal(long number) {

		int decimalNumber = 0, i = 0;
		long remainder;

		while (number != 0) {
			remainder = number % 10;
			number /= 10;
			decimalNumber += remainder * Math.pow(2, i);
			++i;
		}

		return decimalNumber;
	}

}
