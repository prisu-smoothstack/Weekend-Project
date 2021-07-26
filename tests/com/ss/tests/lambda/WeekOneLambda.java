package com.ss.tests.lambda;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.ss.week1.lambda.PerformOperation;

public class WeekOneLambda {
	@Test
	public void evenTest() {
		PerformOperation perf = new PerformOperation();
		assertEquals("EVEN", perf.run(new Integer[]{1, 2}));
	}
}
