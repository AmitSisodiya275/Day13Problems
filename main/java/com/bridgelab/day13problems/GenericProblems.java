package com.bridgelab.day13problems;

public class GenericProblems {

	public static Integer findIntMax(Integer one, Integer two, Integer three) {

		if (one.compareTo(two) > 0) {
			if (one.compareTo(three) > 0) {
				return one;
			} else {
				return three;
			}
		} else if (two.compareTo(one) > 0) {
			if (two.compareTo(three) > 0) {
				return two;
			} else {
				return three;
			}
		} else
			return three;
	}
}
