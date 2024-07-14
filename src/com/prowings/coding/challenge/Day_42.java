package com.prowings.coding.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, skip the first two elements,
// remove odd numbers, and return the next four elements in descending order using Stream API.
public class Day_42 {

	public static void main(String[] args) {

		List<Integer> ob = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(ob);
		List<Integer> ob1 = ob.stream().skip(2).filter(num -> num % 2 == 0)
				.sorted((num1, num2) -> num2.compareTo(num1))
				.limit(4)
				.collect(Collectors.toList());
		System.out.println(ob1);
	}
}
