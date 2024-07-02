package com.prowings.coding.challenge;
// WAP to sorting given list in alphabetical order .
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day_31 {

	public static void main(String[] args) {

		List<String> ob = new ArrayList<String>(Arrays.asList("Russia", "Italy","US", "India", "England", "China"));

		System.out.println("Original List :" + ob);

		Collections.sort(ob, (s1, s2) -> s1.compareToIgnoreCase(s2));

		System.out.println("Sorted List :" + ob);
	}
}
