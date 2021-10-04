package com.bridgelab.day13problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GenericProblemsTest {

	@Test
	public void testFindIntMaxTC1() {
		int result = GenericProblems.findIntMax(50, 20, 15);
		assertEquals(50, result);
	}

	@Test
	public void testFindIntMaxTC2() {
		int result = GenericProblems.findIntMax(15, 50, 20);
		assertEquals(50, result);
	}

	@Test
	public void testFindIntMaxTC3() {
		int result = GenericProblems.findIntMax(15, 20, 50);
		assertEquals(50, result);
	}

	@Test
	public void testFindFloatMaxTC1() {
		float result = GenericProblems.findFloatMax(50.50f, 20.20f, 15.15f);
		assertEquals(50.50f, result, 50.50f);
	}

	@Test
	public void testFindFloatMaxTC2() {
		float result = GenericProblems.findFloatMax(20.20f, 50.50f, 15.15f);
		assertEquals(50.50, result, 50.50f);
	}

	@Test
	public void testFindFloatMaxTC3() {
		float result = GenericProblems.findFloatMax(20.20f, 15.15f, 50.50f);
		assertEquals(50.50, result, 50.50f);
	}

	@Test
	public void testFindStringMaxTC1() {
		String result = GenericProblems.findStringMax("Pear", "Apple", "Banana");
		assertEquals("Pear", result);
	}

	@Test
	public void testFindStringMaxTC2() {
		String result = GenericProblems.findStringMax("Apple", "Pear", "Banana");
		assertEquals("Pear", result);
	}

	@Test
	public void testFindStringMaxTC3() {
		String result = GenericProblems.findStringMax("Apple", "Banana", "Pear");
		assertEquals("Pear", result);
	}
}
