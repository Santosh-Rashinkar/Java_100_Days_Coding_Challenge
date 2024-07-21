package com.prowings.coding.challenge;
//          1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5
//6 5 4 3 2 1 2 3 4 5 6

public class Day_47 {

	public static void pattern1(int n) {

		int i, j;

		for (i = 1; i <= n; i++) {
			
			for (j = 1; j <= 2 * (n - i); j++) {
				
				System.out.print(" ");
			}
			
			for (j = i; j >= 1; j--) {
				
				System.out.print(j + " ");
			}
			
			for (j = 2; j <= i; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}

 public static void main(String[] args) {

		int n = 6;
		pattern1(n);
		
	}
}
