package com.prowings.coding.challenge;

public class Day_46 {

	public static void main(String[] args) {

		int[] array = { 5, 3, 8, 1, 2, 7, 4, 6 };

		System.out.println("Original Array: ");

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 1 + 1; j < array.length; j++) {
				
				if (array[i] > array[i]) {

					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
