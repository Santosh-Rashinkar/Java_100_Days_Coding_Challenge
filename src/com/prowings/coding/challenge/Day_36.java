package com.prowings.coding.challenge;
// WAP to check if a string is numeric .

public class Day_36 {

	public static void main(String[] args) {

		String s = "-1234.15";
		boolean numeric = true;

		numeric = s.matches("-?\\d+(\\.\\d+)?");
		if (numeric)
			System.out.println(s + " is a number");
		else
			System.out.println(s + " is a number");
	}

}