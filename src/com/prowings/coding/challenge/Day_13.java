package com.prowings.coding.challenge;

//WAP to Display Fibonacci Series .

public class Day_13 {

	public static void main(String[] args) {
		int n = 10, ft = 0, st = 1;
		System.out.println("Fibonacci Series till " + n + "terms :");

		for (int i = 1; i <= n; i++) {
			System.out.println(ft + " ");
			int nt = ft + st;
			ft = st;
			st = nt;
			
		}
	}
}
