package com.prowings.coding.challenge;

//WAP to remove all whitespeces from a given string .
public class Day_26 {

	public static void main(String[] args) {
		String input = "This_  is_  a_  test_  string_  with_  spaces";
		String result = removeWhitespaces(input);
		System.out.println("Original String: " + input);
		System.out.println("String without Whitespaces: " + result);
	}

	public static String removeWhitespaces(String str) {

		return str.replaceAll("\\s", "");
	}
}
