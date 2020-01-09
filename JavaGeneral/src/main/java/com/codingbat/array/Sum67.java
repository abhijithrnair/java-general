package com.codingbat.array;

public class Sum67 {
	public int sum67(int[] nums) {
		int sum = 0;
		if (nums.length == 0) {
			return 0;
		} else {
			boolean flag = true;
			for (int i = 0; i < nums.length; i++) {
				if ((nums[i] != 6 && flag) || (!flag && nums[i - 1] == 7)) {
					sum += nums[i];
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
