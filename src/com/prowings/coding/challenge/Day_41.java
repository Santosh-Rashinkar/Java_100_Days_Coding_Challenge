package com.prowings.coding.challenge;
// WAP to start a word in special word "P".
import java.util.ArrayList;
import java.util.Arrays;

public class Day_41 {

	public static void main(String[] args) {
		
		ArrayList<String> ob = new ArrayList<String>(Arrays.asList("Pramod","Pranav","Paresh","sarthak","arjun","aditya","santosh"));
		System.out.println(ob);
		
		long l = ob.stream().filter(i->i.startsWith("P")).count();
		System.out.println("Special Character = " + l);
	}
}
