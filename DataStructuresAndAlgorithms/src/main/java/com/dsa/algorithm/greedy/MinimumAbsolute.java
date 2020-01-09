package com.dsa.algorithm.greedy;

import java.util.Arrays;

public class MinimumAbsolute {

	public static void main(String[] args) {
		int[] arr = { 3, -7, 0 };
		System.out.println(minimumAbsoluteDifference(arr));
	}

	// Complete the minimumAbsoluteDifference function below.
	static int minimumAbsoluteDifference(int[] arr) {
		int min = 0;
		int result = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			min = Math.abs(arr[i] - arr[i + 1]);
			result =Math.min(min, result);
		}
		return result;
	}

}
