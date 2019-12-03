package com.yash.fserv;

import java.util.HashSet;

/**
 * 
 * @author mayank.soni
 * 
 * How to implement validator for inputs (follow URL) - 
 * https://www.codementor.io/ishan1604/validating-models-user-inputs-java-android-du107w0st
 *
 */

public class HashSort {

	public static void main(String args[]) {
		HashSet<Short> s = new HashSet<Short>();
		for (Short i = 0; i < 100; i++) {
			s.add(i);
			s.remove(i - 1);
		}
		System.out.println(s.size());
	}

}
