package com.ss.day5.datetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class FindThursday {
	private LocalDateTime date;
	public LocalDateTime getThursday(LocalDateTime ldt) {
		DayOfWeek day = ldt.getDayOfWeek();
		switch (day) {
		case FRIDAY: return ldt.minusDays(1);
		case SATURDAY: return ldt.minusDays(2);
		case SUNDAY: return ldt.minusDays(3);
		case MONDAY: return ldt.minusDays(4);
		case TUESDAY: return ldt.minusDays(5);
		case WEDNESDAY: return ldt.minusDays(6);
		case THURSDAY: return ldt.minusDays(7);
		default: return null; 
		}
	}
	public FindThursday(LocalDateTime ldt) {
		this.date = getThursday(ldt);
	}
	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
}
