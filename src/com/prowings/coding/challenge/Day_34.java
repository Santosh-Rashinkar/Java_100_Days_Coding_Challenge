package com.prowings.coding.challenge;

//WAP to find last occurrence of a character in a given String .
public class Day_34 {

	public static void main(String[] args) {
		
		String s = "SANTOSH";
		
		String s1 [] = s.split(" ");
		
		int a = 0;
		
		for(int i = 0;i<s1.length;i++) {
			if(s1[s1.length-1]==s1[i]) {
				a++;
			}
				
		}
		System.out.println(s1[s1.length-1] +"\t"+ "last character occurs "+ a +" times");
		
	}
}
