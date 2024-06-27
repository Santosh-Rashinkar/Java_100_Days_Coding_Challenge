package com.prowings.coding.challenge;

//WAP to convert String to Date 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Day_27 {

	public static void main(String[] args) {

		String dateString = "2024-06-27"; // Example date string
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		try {
			LocalDate date = LocalDate.parse(dateString, formatter);
			System.out.println("Date: " + date);
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
	}

}
