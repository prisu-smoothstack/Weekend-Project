package com.ss.tests.recursion;
import org.junit.jupiter.api.*;

import com.ss.week1.recursion.RecursionExam;

import static org.junit.jupiter.api.Assertions.*;
public class RecursionTests {
	@Test
	public void recursionTest() {
		assertTrue(RecursionExam.groupSumClump(new Integer[] {2, 4, 8}, 10));
		assertTrue(RecursionExam.groupSumClump(new Integer[] {1, 2, 4, 8, 1}, 14));
		assertFalse(RecursionExam.groupSumClump(new Integer[] {2, 4, 4, 8}, 14));
	}
}
