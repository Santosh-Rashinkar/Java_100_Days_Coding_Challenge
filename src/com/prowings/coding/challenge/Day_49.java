package com.prowings.coding.challenge;
/* Write a Java program that creates a custom exception class called 
 * Negative Input Exception extends Exception  the program should accept 
 * an input and throw a NegativeInputException handle the exception and display
 * a custom message indicating
 */
import java.util.Scanner;

public class Day_49 {

	// Custom exception class
	class NegativeInputException extends Exception {
	    public NegativeInputException(String message) {
	        super(message);
	    }
	}
	
//	public class CustomExceptionExample {
		
	 public void checkForNegativeInput(int number) throws NegativeInputException {
	        if (number < 0) {
	            throw new NegativeInputException("Negative input is not allowed: " + number);
	        }
	    }

	 public static void main(String[] args) {
		 
		 
	        Scanner scanner = new Scanner(System.in);
	        
	        Day_49 ob = new Day_49();


	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        try {
	            // Check for negative input
	           ob.checkForNegativeInput(number);
	            System.out.println("You entered: " + number);
	        } catch (NegativeInputException e) {
	            // Handle the custom exception
	            System.out.println("Custom Exception Caught: " + e.getMessage());
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }
	    }
}
