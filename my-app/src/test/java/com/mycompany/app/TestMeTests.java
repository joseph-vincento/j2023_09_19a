package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mycompany.app.TestMe;

public class TestMeTests {
	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe = new TestMe();
	}

	@Test
	public void squareTest() {
		double baseValue = 3.0;
		double expected = baseValue * baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

	@Test
	public void cubeTest() {
		double base = 2.0;
		double expected = 8.0;
		testMe.setValue(base);
		double actual = testMe.cube();

		assertTrue(actual == expected);
	}

	@Test
	public void divTest() {
		// Case 1: divide by non zero number
		double d = 2.0;
		double n = 4.0;
		testMe.setValue(n);
		double expected = n / d;
		double actual = testMe.div(d);

		assertTrue(actual == expected);

		//Case 2: divide by zero
		// double d_2 = 0.0;

		// Exception e = assertThrows(
		// 	ArithmeticException.class,
		// 	() -> testMe.div(d_2)
		// );

		// assertTrue(e.getMessage() == "Cannot divide by zero!");
	}

	@Test
	public void is_wholeTest() {
		// Case 1: value is a whole number
		double v = 2.0;
		testMe.setValue(v);
		assertTrue(
			testMe.is_whole()
		);

		// Case 2: value is not whole
		v = 2.5;
		testMe.setValue(v);
		assertFalse(
			testMe.is_whole()
		);
	}

}
