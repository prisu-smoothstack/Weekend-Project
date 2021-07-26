package com.ss.week1.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RecursionExam {
	/**
	 * 
	 * @param A Array of Integers
	 * @param N Array index
	 * @param T Target Number
	 * @return Integer of the target or just whatever
	 */
	static Integer sums(Integer A[], Integer N, Integer T) {
		Integer sum = 0;
		if (N < 0) {
			return null;
		}
		for (int s = N; s >= 0; s--) {
			sum += A[s];
			if (sum.equals(T))
				return T;
			else
				continue;
		}
		return sums(A, N-1, T);
		
	}
	/**
	 * Takes an array of Integers and a target and creates evalutaes if you can group any numbers together in such a way as it equals a target
	 * @param nums Array of Integers
	 * @param target Target number
	 * @return Boolean evaluating if it meets the conditions
	 */
	public static boolean groupSumClump(Integer[] nums, Integer target) {
		int prev = 0;
		int sum = 0;
		List<Integer> numbers = new ArrayList();
		boolean first = true;
		for (int i : nums) {
			if (first) {
				prev = i;
				sum += i;
				first = false;
				continue;
			}
			if (i == prev) {
				sum += i;
			}
			else {
				numbers.add(sum);
				prev = i;
				sum = i;
			}
			numbers.add(sum);
		}
		
		try {
			for (Integer s : numbers) {
				Integer[] numArray = numbers.stream().filter((i) -> ((Integer) i != (Integer) s)).toArray(Integer[]::new);
				if(sums(numArray, numArray.length-1, target) == target) {
					return true;
				}
				else {
					continue;
				}
		}
		}
		catch (Exception e) {
			return false;
		}
		return false;
	}
}
