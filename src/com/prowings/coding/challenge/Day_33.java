package com.prowings.coding.challenge;
// WAP to Count a Array size and print the size.
import java.util.ArrayList;

public class Day_33 {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<>();
		
		obj.add(1);
		obj.add(12);
		obj.add(21);
		obj.add(31);
		obj.add(41);
		obj.add(51);
		obj.add(61);
		
		System.out.println("Size Of Array : " + findSize(obj));
	}

	public static int findSize(ArrayList<Integer> obj) {
		
		int count = 0;
		
		for(int element : obj) {
			
			count ++;
		}
		return count;
	}
}
