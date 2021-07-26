package com.ss.tests.datetime;
import org.junit.jupiter.api.Test;

import com.ss.day5.datetime.FindThursday;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
public class DateTimeTests {
	@Test
	public void findThursdayTest() {
		FindThursday date = new FindThursday(LocalDateTime.of(2002, Month.APRIL, 11, 0, 0, 0));
		assertEquals(LocalDateTime.of(2002, Month.APRIL, 4, 0, 0, 0), date.getDate());
		assertEquals(DayOfWeek.THURSDAY, date.getDate().getDayOfWeek());
	}
}
