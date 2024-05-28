package com.prowings.coding.challenge;

//WAP to find sum of 3 numbers and print the largest number.

public class Day_3 {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 10;
		
		// Call the function to calculate sum and find the largest number
		calculateSumAndLargest(a, b, c);
	}
	
	
    // Function to calculate sum and find the largest number
    public static void calculateSumAndLargest(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum = " + sum);

        if (a > b && a > c) {
            System.out.println("Largest = " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest = " + b);
        } else {
            System.out.println("Largest = " + c);
        }
    }

}

