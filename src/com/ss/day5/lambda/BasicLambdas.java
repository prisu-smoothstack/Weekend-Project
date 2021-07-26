/**
 * 
 */
package com.ss.day5.lambda;

import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Space Prius
 *
 */
public class BasicLambdas {
	private static Integer eSearch(String s1, String s2) {
		if (s1.contains("e") && s2.contains("e"))
			return 0;
		else if (s1.contains("e"))
			return 1;
		else if (s2.contains("e"))
			return -1;
		else
			return 0;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] owl = {"Luz","Amity","Eda","King","Gus","Willow"};
		// Sort by Length
		Arrays.sort(owl,
				(String a, String b) -> a.length() - b.length());
		// Sort by Reverse Length
		Arrays.sort(owl,
				(String a, String b) -> b.length() - a.length());
		// Sort by first character
		Arrays.sort(owl,
				(String a, String b) -> a.charAt(0) - b.charAt(0));
		// Sort by E
		Arrays.sort(owl,
				(String a, String b) -> {
					if (a.contains("e") && b.contains("e"))
						return 0;
					else if (a.contains("e"))
						return 1;
					else if (b.contains("e"))
						return -1;
					else
						return 0;
				});
		Arrays.sort(owl,
				(String a, String b) -> eSearch(a, b));
		
	}

}
