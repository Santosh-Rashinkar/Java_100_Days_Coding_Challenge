package com.prowings.coding.challenge;
// WAP to convert the Arraylist to an array and vice versa .
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day_30 {

	public static void main(String[] args) {
		
		String [] array = {"C++","Java","Python",".Net","JavaScript"};
		
		System.out.println("Print The Given Array : "+ Arrays.toString(array));
		
		
		List languages = new ArrayList<>(Arrays.asList(array));
		
		System.out.println("Convert Array to List And Print The List :" + languages);
	}
	
}
