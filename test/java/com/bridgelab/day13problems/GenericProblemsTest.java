package com.bridgelab.day13problems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

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
}
