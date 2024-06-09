package com.prowings.coding.challenge;

//WAP to check Vowel And Consonants

import java.util.Scanner;

public class Day_8 {

	public static void main(String[] args) {
		
		char ab;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a alphabate");
		ab = scan.next().charAt(0);
		if(ab =='a'|| ab =='A' || ab == 'e' || ab =='E' || ab == 'i' || ab == 'I' || ab =='o'|| ab == 'O' || ab == 'u' || ab == 'U') {
			System.out.println("This is Vowel");	
		}
		else {
			System.out.println("It is Consonant");
		}
		scan.close();	
	}
}
