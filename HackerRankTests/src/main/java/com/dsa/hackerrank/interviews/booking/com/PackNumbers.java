package com.dsa.hackerrank.interviews.booking.com;

import java.util.LinkedList;
import java.util.List;

public class PackNumbers {

	static List<String> packNumbers(List<Integer> arr) {
		List<String> result = new LinkedList<String>();
		int i = 0;
		int j = 0;
		String resultString = "";
		while (i < arr.size() - 1) {
			int counter = 0;
			if (arr.get(i + 1) != null && (arr.get(i) == arr.get(i + 1))) {
				j = i;
				while (arr.get(j) == arr.get(i)) {
					counter++;
					resultString = "'" + arr.get(j) + ":" + counter + "'";
					j++;
				}
				result.add(resultString);
				i = j;
			} else {
				result.add(arr.get(i).toString());
				i++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> integers = new LinkedList<Integer>();
		integers.add(5);
		integers.add(5);
		integers.add(5);
		integers.add(7);
		integers.add(7);
		integers.add(3);
		integers.add(4);
		integers.add(7);
		List<String> result = packNumbers(integers);
		for (String a : result)
			System.out.println(a);
	}

}
