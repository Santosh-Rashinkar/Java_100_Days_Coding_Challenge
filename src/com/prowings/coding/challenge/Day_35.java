package com.prowings.coding.challenge;
// WAP to reverse a odd number string .

public class Day_35 {

	public static void main(String[] args) {

		String s = "S A N T O S H";
		String a[] = s.split(" ");
		int rev = 0, rem;
		for (int i = a.length -1; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
