package com.prowings.coding.challenge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//WAP to Calculate Difference Between Two Time Periods .

public class Day_24 {

	public static void main(String[] args) {

		String time1 = "18:00:00";
		String time2 = "7:30:50";

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

		try {
 
		Date date1 = simpleDateFormat.parse(time1);
		 
		Date date2 = simpleDateFormat.parse(time2);

		long differenceInMilliSeconds = Math.abs(date2.getTime() - date1.getTime());

		long differenceInHours = (differenceInMilliSeconds / (60 * 60 * 1000)) % 24;
		
		long differenceInMinutes = (differenceInMilliSeconds / (60 * 1000)) % 60;
		
		long differenceInSeconds = (differenceInMilliSeconds / 1000) % 60;

		System.out.println("Difference is " + differenceInHours + " hours " + differenceInMinutes + " minutes "
				+ differenceInSeconds + " Seconds. ");
	}
	catch (ParseException e) {	
		e.printStackTrace();
	}
  }

}
