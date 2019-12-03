package com.yash.assignment3;

import org.junit.Test;

public class PermutationTest {

	Permutation permutation = new Permutation();

	@Test
	public void shouldReturnPermutations() {
		String totalPermutation = permutation.getTotalPermutation("ABC", "");
		System.out.println(totalPermutation);
	}

}
