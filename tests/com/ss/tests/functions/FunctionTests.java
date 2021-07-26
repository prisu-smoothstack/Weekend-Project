package com.ss.tests.functions;
import org.junit.jupiter.api.*;

import com.ss.week1.functions.FunctionEval;

import static org.junit.jupiter.api.Assertions.*;
public class FunctionTests {
	@Test
	public void rightDigitTest() {
		assertArrayEquals(new Integer[] {1, 2, 3}, FunctionEval.rightDigit(new Integer[] {1, 22, 93}));
		assertArrayEquals(new Integer[] {6, 8, 6, 8, 1}, FunctionEval.rightDigit(new Integer[] {16, 8, 886, 8, 1}));
		assertArrayEquals (new Integer[] {0,0}, FunctionEval.rightDigit(new Integer[] {10, 0}));
	}
	@Test
	public void doublingTest() {
		assertArrayEquals(new Integer[] {2, 4, 6}, FunctionEval.doubling(new Integer[] {1, 2, 3}));
		assertArrayEquals(new Integer[] {12, 16, 12, 16, -2}, FunctionEval.doubling(new Integer[] {6, 8, 6, 8, -1}));
		assertArrayEquals(new Integer[] {}, FunctionEval.doubling(new Integer[] {}));
	}
	@Test
	public void noXTest() {
		assertArrayEquals(new String[] {"a", "bb", "c"}, FunctionEval.noX(new String[] { "ax", "bb", "cx"}));
		assertArrayEquals(new String[] {"a", "bb", "c"}, FunctionEval.noX(new String[] {"xxax", "xbxbx", "xxcx"}));
		assertArrayEquals(new String[] {""}, FunctionEval.noX(new String[] {"x"}));
	}
}
