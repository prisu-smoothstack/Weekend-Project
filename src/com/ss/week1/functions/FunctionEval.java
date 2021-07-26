package com.ss.week1.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionEval {
	/**
	 * 
	 * @param i
	 * @return Array of the right most integers of array i
	 */
	public static Integer[] rightDigit(Integer[] i) {
		Integer[] output = new Integer[i.length];
		for (int n = 0; n < i.length; n++) {
			char[] c = Integer.toString(i[n]).toCharArray();
			Integer out = Character.getNumericValue(c[c.length-1]);
			output[n] = out;
		}
		return output;
	}
	/**
	 * 
	 * @param i
	 * @return array of doubled integers
	 */
	public static Integer[] doubling(Integer[] i) {
		Integer[] output = new Integer[i.length];
		for (int n = 0; n < i.length; n++) {
			output[n] = i[n] * 2;
		}
		return output;
	}
	/**
	 * 
	 * @param s
	 * @return array of strings with no x
	 */
	public static String[] noX(String[] s) {
		List<String> input = Arrays.asList(s);;
		String[] output = input.stream().map((a) -> a.replaceAll("[xX]", "")).toArray(String[]::new);
		return output;
	}
}
