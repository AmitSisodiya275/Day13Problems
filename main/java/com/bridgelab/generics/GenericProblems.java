package com.bridgelab.generics;

public class GenericProblems<t extends Comparable<t>> {
	
	t inputOne, inputTwo, inputThree;
	
	public GenericProblems(t inputOne, t inputTwo, t inputThree) {
		this.inputOne = inputOne;
		this.inputTwo = inputTwo;
		this.inputThree = inputThree;
	}
	
	public t findMax() {
		return GenericProblems.findMax(inputOne, inputTwo, inputThree);
	}
	public static <t extends Comparable<t>> t findMax(t inputOne, t inputTwo, t inputThree) {
		t max = inputOne;
		if (inputTwo.compareTo(max) > 0)
			max = inputTwo;
		if (inputThree.compareTo(max) > 0)
			max = inputThree;
		return max;
	}
}
