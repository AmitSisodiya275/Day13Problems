package com.bridgelab.day13problems;

public class GenericProblems {

	public static <t extends Comparable<t>> t findMax(t one, t two, t three) {
		t max = one;
		if (two.compareTo(max) > 0)
			max = two;
		if (three.compareTo(max) > 0)
			max = three;
		return max;
	}
}
