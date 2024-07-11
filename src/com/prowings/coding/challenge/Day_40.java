package com.prowings.coding.challenge;

// WAP to calculate a program's average of a list of integers using streams.
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Day_40 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(100, 200, 300, 400, 500);

		OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
		if (average.isPresent()) {

			System.out.println("Average : " + average.getAsDouble());
		} else {
			System.out.println("The list is empty, no average to calculate.");
		}
	}
}
