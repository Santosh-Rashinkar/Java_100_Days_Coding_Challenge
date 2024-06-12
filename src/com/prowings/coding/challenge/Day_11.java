package com.prowings.coding.challenge;
// WAP to Find Factorial of a Number .

import java.util.Scanner;

public class Day_11 {
	
public static void main(String[] args) {
	long F = 1;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scan.nextInt();
	for(int i = 1; i <= num;++i) {	
		F*=i;
	}
	System.out.printf("Factorial of %d = %d", num,F);
	scan.close();
}
}
