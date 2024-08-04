package com.string.program;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		System.out.println("Main Sarted");
		
		String str1 = "REPLY";
		String str2 = "RPELY";
		
		Anagram anagram = new Anagram();
		
		anagram.checkAnagramAndPrint(str1, str2);
		
	}
	public boolean areAnagram(String str1, String str2){
		
		System.out.println("areAnagram Sarted");
		
		str1 = str1.replaceAll(" ","").toLowerCase();
		str2 = str2.replaceAll(" ","").toLowerCase();
		
		if(str1.length() != str2.length()) {
			
			return false;
		} 
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
	public void checkAnagramAndPrint(String str1,String str2){
		
		System.out.println("checkAnagramAndPrint Sarted");

		if(areAnagram(str1, str2)) {
			
			System.out.println(str1 + " AND "+str2+" ARE ANAGRAM ");
		}
		else
		{
			System.out.println(str1 + " AND "+str2+" ARE NOT ANAGRAM ");		
		}
	}
	

}