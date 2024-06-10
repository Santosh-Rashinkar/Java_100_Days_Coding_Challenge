package com.prowings.coding.challenge;
// WAP to find all Roots of a Quadratic Equation .
import java.util.Scanner;

public class Day_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year -");
		int year = scan.nextInt();
		scan.close();
		boolean leap = false;
		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		if (leap)
			System.out.println(year + " " + "is a leap year .");
		else
			System.out.println(year + " " + "is not a leap year .");
	}

}
