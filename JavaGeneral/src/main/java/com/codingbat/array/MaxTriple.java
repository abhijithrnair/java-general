package com.codingbat.array;

public class MaxTriple {
	public static int maxTriple(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];
		int mid = nums[((nums.length) / 2)];
		int max1 = Math.max(first, last);
		int max2 = Math.max(max1, mid);
		return max2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxTriple(new int[] { 1, 10, 5 }));
	}

}
