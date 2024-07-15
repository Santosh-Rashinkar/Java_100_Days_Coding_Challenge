package com.prowings.coding.challenge;

// WAP function to count the frequency of each element in the arrayand store the 
//result in a HashMap<Integer, Integer>. The Key should be the element, and the value should be its frequency.

import java.util.Arrays;
import java.util.HashMap;

public class Day_44 {

	public static void main(String[] args) {

		int array[] = { 11, 22, 3, 4, 2, 3, 4, 55 };

		System.out.println(Arrays.toString(array));

		HashMap<Integer, Integer> ob = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					array[j] = -1;
				}
				if (array[i] != -1) {
					ob.put(array[i], count);
				}
			}
			System.out.println(ob);
		}
	}
}
