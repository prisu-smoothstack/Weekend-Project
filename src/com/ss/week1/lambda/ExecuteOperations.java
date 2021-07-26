/**
 * 
 */
package com.ss.week1.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ss.week1.lambda.PerformOperation.IsOdd;

/**
 * @author Space Prius
 *
 */
public class ExecuteOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String filename = "D:\\Eclipse Workspace\\Weekend Project\\src\\com\\ss\\week1\\lambda\\input.txt";
		List<Integer[]> input = new ArrayList();
		PerformOperation perf = PerformOperation.getInstance();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parsed = line.split("\\s");
				Integer[] converted = { Integer.parseInt(parsed[0]), Integer.parseInt(parsed[1]) };
				input.add(converted);
			}
			for (Integer[] i : input) {
				System.out.println(perf.run(i));
			}
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
