package com.yash.assignment3;

public class Permutation {

	public String getTotalPermutation(String inputString, String ans) {

		if (inputString.length() == 0) {
			System.out.print(ans + " ");
			return inputString;
		}

		for (int i = 0; i < inputString.length(); i++) {

			// ith character of str
			char ch = inputString.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = inputString.substring(0, i) + inputString.substring(i + 1);

			// Recurvise call
			getTotalPermutation(ros, ans + ch);
		}

		return inputString;
	}

}
