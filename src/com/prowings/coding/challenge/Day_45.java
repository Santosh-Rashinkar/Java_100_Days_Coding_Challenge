package com.prowings.coding.challenge;
// WAP to left rotate
import java.util.Arrays;

public class Day_45 {

	public int[] left(int a[]) {

		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];		}
		a[a.length - 1] = temp;
		return a;
	}

	public static void main(String[] args) {

		Day_45 ob = new Day_45();
		int a[] = { 1, 2, 3, 4, 5 };
		int rot[] = ob.left(a);
		System.out.println(Arrays.toString(rot));
	}

}
