package com.prowings.coding.challenge;

//WAP remove duplicate using string API .

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day_37 {

	public static void main(String[] args) {
    ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(11);
		ob.add(12);
		ob.add(13);
		ob.add(11);
		ob.add(14);
		ob.add(17);
		ob.add(13);
		ob.add(18);
		ob.add(19);
		ob.add(21);
		ob.add(22);
		ob.add(21);
		ob.add(12);
		ob.add(19);
		ob.add(17);
		ob.add(16);
		System.out.println("Before Removing Duplicate: " + ob);
		List<?> D = ob.stream().distinct().collect(Collectors.toList());
		System.out.println("After Removing Duplicate : " + D);

	}
}
