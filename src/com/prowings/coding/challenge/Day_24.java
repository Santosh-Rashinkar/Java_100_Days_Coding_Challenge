package com.prowings.coding.challenge;

import java.sql.Date;
import java.text.SimpleDateFormat;

//WAP to Calculate Difference Between Two Time Periods .

public class Day_24 {

	public static void main(String[] args) {
		
		String time1 = "18:00:00";
		String time2 = "7:30:50";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		
		Date date1 = dateFormat.parse(time1);
		Date date2 = dateFormat.parse(time2);
		
		long differenceInMilliSeconds = Math.abs(date2.getTime()-date1.getTime());
		
		long differenceInHours = (differenceInMilliSeconds/(60*60*1000))%24;
		long differenceInMinutes = (differenceInMilliSeconds/ (60*1000))%60;
		long differenceInSeconds = (differenceInMilliSeconds/1000)%60;
		
		System.out.println("Difference is "+differenceInHours+"hours"+differenceInMinutes+"mi");
		
	}
	
}
