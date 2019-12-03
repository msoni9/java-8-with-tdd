package com.yash.fserv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

	// Complete the findNumber function below.
	// Complete the oddNumbers function below.
	static List<Integer> oddNumbers(int l, int r) {
		List<Integer> onlyOdds = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			if (i % 2 != 0) {
				onlyOdds.add(i);
				l++;
			}
		}
		return onlyOdds;

	}

	public static void main(String[] args) throws IOException {
		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));
		//
		// int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
		//
		// List<String> arrTemp = new ArrayList<>();
		//
		// IntStream.range(0, arrCount).forEach(i -> {
		// try {
		// arrTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
		// } catch (IOException ex) {
		// throw new RuntimeException(ex);
		// }
		// });
		//
		// List<Integer> arr =
		// arrTemp.stream().map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
		//
		// int k = Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> res = oddNumbers(3, 9);
		System.out.println(res);

		// bufferedWriter.write(res);
		// bufferedWriter.newLine();
		//
		// bufferedReader.close();
		// bufferedWriter.close();
	}

}
