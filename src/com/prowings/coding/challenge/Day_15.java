package com.prowings.coding.challenge;

import java.util.Scanner;

public class Day_15 {

	public static void main(String[] args) {
		
		int lcm;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		lcm =(n1 > n2) ? n1 : n2;
		scan.close();
		
		while(true) {
			if(lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.printf("The LCM of %d and %d is %d.",n1,n2,lcm);
				break;
			}
			lcm++;
		}
	}
}
