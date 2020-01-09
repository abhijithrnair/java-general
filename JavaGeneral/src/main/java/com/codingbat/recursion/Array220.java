package com.codingbat.recursion;

public class Array220 {
	public static boolean array220(int[] nums, int index) {
		if (nums.length == 0 || index + 1 > nums.length - 1) {
			return false;
		} else if (nums[index + 1] == nums[index] * 10) {
			return true;
		} else if (nums.length > index + 1) {
			return array220(nums, index + 1);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Array220.array220(new int[] { 20, 2, 21, 210 }, 0));
	}

}
