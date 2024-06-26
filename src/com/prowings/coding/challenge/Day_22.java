package com.prowings.coding.challenge;

// WAP to count vowels, consonant, digits and White Spaces in string .

public class Day_22 {

	public static void main(String[] args) {

		String line = "This is Java Program 123456";

		int vowels = 0, consonants = 0, digits = 0, spaces = 0;

		line = line.toLowerCase();

		for (int i = 0; i < line.length(); ++i) {

			char ch = line.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			} else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			} else if ((ch >= '0' && ch <= '9')) {
				++digits;
			} else if (ch == ' ') {
				++spaces;
			}
		}
		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
		System.out.println("Digits : " + digits);
		System.out.println("White Spaces : " + spaces);

	}
}
