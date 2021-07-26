package com.ss.week1.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PerformOperation {

	public interface IsOdd{
		public boolean isOdd(int n);
	}
	
	public interface IsPrime{
		public boolean isPrime(int n);
	}
	public interface IsPalindrome{
		public boolean isPalindrome(int n);
	}
	
	
	private static List<Integer> primeFactors = new ArrayList();
	
	private Integer number;
	
	private static void primeCalc(int number) {
		//Sort it so the highest number comes first
		primeFactors.sort((a, b) -> b - a);
		// Check if the current number is greater than the current max
		// Then we calculate the all the primes up to the number we want to check
		if (number > primeFactors.get(0)) {
			for (int i = primeFactors.get(0); i < number; i++) {
				boolean isPrime = true;
				for (Integer n : primeFactors) {
					if (i % n == 0)
						isPrime = false;
				}
				//Add if a number is prime
				if (isPrime)
					primeFactors.add(i);
			}
		}
		primeFactors.sort((a, b) -> a - b);
	}
	//Check if a number is odd
	IsOdd isOdd = (n) -> {
		if (n % 2 == 0)
			return false;
		else
			return true;
	};
	// Check if a number is prime
	IsPrime isPrime = (n) -> {
		primeCalc(n);
		for (Integer i : primeFactors) {
			if (n % i == 0 && n != i)
				return false;
			else
				continue;
		}
		return true;
	};
	
	IsPalindrome isPalindrome = (n) -> {
		//Convert the integer to a string array so its easier to work with
		String[] input = Integer.toString(n).split("");
		List<Integer> forward = new ArrayList();
		List<Integer> backwards = new ArrayList();
		//Convert the strings back into integers
		for (String s : input) {
			forward.add(Integer.parseInt(s));
		}
		//Create the backwards array to check against
		for (Integer i = forward.size()-1; i >= 0; i--) {
			backwards.add(forward.get(i));
		}
		//Check to see if it is truly a palindrome
		for (Integer i = 0; i < forward.size(); i++) {
			if (forward.get(i) != backwards.get(i))
				return false;
			else
				continue;
		}
		return true;
	};
	
	public String run(Integer[] i) {
		try {
			switch (i[0]) {
			case 1:
				if(isOdd.isOdd(i[1]))
					return "ODD";
				else
					return "EVEN";
			case 2:
				if(isPrime.isPrime(i[1]))
					return "PRIME";
				else
					return "COMPOSITE";
			case 3:
				if(isPalindrome.isPalindrome(i[1]))
					return "PALINDROME";
				else
					return "NOT PALINDROME";
			default:
				return "ERROR";
					
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}
	}
	
	public PerformOperation() {
		primeFactors.add(2);
		primeFactors.add(3);
		primeFactors.add(5);
		primeFactors.add(7);
		primeCalc(200);
	}
	private static volatile PerformOperation _instance;
	
	public static PerformOperation getInstance() {
			if (_instance == null) {
				synchronized(PerformOperation.class) {
					if(_instance == null)
						_instance = new PerformOperation();
				}
			}
			return _instance;
		}
	}
