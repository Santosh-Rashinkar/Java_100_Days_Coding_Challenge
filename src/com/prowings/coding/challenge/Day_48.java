package com.prowings.coding.challenge;

// WAP to Pattern 

/*        a
          b c 
          d e f
          g h i j
          k l m n o 
          
 */

public class Day_48 {

	public static void main(String[] args) {

		char currentChar = 'a';

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(currentChar + " ");
			}
			System.out.println();
		}
	}
}
