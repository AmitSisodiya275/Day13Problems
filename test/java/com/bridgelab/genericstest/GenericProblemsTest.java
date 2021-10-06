package com.bridgelab.genericstest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelab.generics.GenericProblems;

public class GenericProblemsTest {

	@Test
	public void testFindIntMaxTC1() {
		GenericProblems<Integer> generic = new GenericProblems<>(50, 20, 15);
		int result = (int) generic.findMax();
		assertEquals(50, result);
	}

	@Test
	public void testFindIntMaxTC2() {
		GenericProblems<Integer> generic = new GenericProblems<>(20, 50, 15);
		int result = (int) generic.findMax();
		assertEquals(50, result);
	}

	@Test
	public void testFindIntMaxTC3() {
		GenericProblems<Integer> generic = new GenericProblems<>(20, 15, 50);
		int result = (int) generic.findMax();
		assertEquals(50, result);
	}

	@Test
	public void testFindFloatMaxTC1() {
		GenericProblems<Float> generic = new GenericProblems<>(50.50f, 20.20f, 15.15f);
		float result = generic.findMax();
		assertEquals(50.50f, result, 50.50f);
	}

	@Test
	public void testFindFloatMaxTC2() {
		GenericProblems<Float> generic = new GenericProblems<>(20.20f, 50.50f, 15.15f);
		float result = generic.findMax();
		assertEquals(50.50, result, 50.50f);
	}

	@Test
	public void testFindFloatMaxTC3() {
		GenericProblems<Float> generic = new GenericProblems<>(20.20f, 15.15f, 50.50f);
		float result = generic.findMax();
		assertEquals(50.50, result, 50.50f);
	}

	@Test
	public void testFindStringMaxTC1() {
		GenericProblems<String> generic = new GenericProblems<>("Pear", "Apple", "Banana");
		String result = generic.findMax();
		assertEquals("Pear", result);
	}

	@Test
	public void testFindStringMaxTC2() {
		GenericProblems<String> generic = new GenericProblems<>("Apple", "Pear", "Banana");
		String result = generic.findMax();
		assertEquals("Pear", result);
	}

	@Test
	public void testFindStringMaxTC3() {
		GenericProblems<String> generic = new GenericProblems<>("Apple", "Banana", "Pear");
		String result = generic.findMax();
		assertEquals("Pear", result);
	}
}
