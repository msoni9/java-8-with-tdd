package com.yash.assignment3;

import java.util.ArrayList;
import java.util.List;

public class DeleteRepeatedCharacter {

	public void getDifferenceBetween(String firstString, String secondString) {

		char[] charArray = firstString.toCharArray();
		char[] charArray2 = secondString.toCharArray();
		
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < charArray.length; i++) {
			list.add(charArray[i]);
		}
		
		for(int i=0; i< charArray2.length ; i++){
			if(list.contains(charArray2[i])){
				
			}
		}
	}

}
