package com.prowings.coding.challenge;
//* 
//* 2
//* 34
//* 456
//* 5678

public class Day_39 {

	public static void main(String[] args) {
		
		for(int i =1; i<=5; i++) {
			
			for(int j = i;j<=5;j++) {
				if(j == 5) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			int a =i;
			for(int j =2;j<=i;j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
}
