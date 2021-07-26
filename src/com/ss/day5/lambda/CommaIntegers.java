/**
 * 
 */
package com.ss.day5.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author Space Prius
 *
 */
public class CommaIntegers {
	private static final List<Integer> ints = new ArrayList<>();
	
	public static void main(String[] args) {
		ints.add(10);
		ints.add(23);
		ints.add(34);
		ints.add(107);
		StringJoiner output = new StringJoiner(",");
		ints.stream().map(
			a -> a % 2 == 0 ? "e" + a.toString() : "o" + a.toString()).forEach(b -> output.add(b));
		System.out.println(output);
	}
}
