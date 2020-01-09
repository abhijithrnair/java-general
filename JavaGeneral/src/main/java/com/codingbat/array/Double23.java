package com.codingbat.array;

public class Double23 {
	public static boolean double23(int[] nums) {
		if (nums.length != 1 && nums.length != 0)
			return ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(double23(new int[] { 2, 2 }));
		
	}

}
