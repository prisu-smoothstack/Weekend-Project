package com.ss.day5.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class StoringDates {
	//Storing birthday April 11th 2002, with a random arbitrary time of birth
	public static LocalDateTime birthday = LocalDateTime.of(2002, Month.APRIL, 11, 11, 38, 15, 8762);
	
	public static void main(String[] args) {
		System.out.println(birthday);
	}
}
