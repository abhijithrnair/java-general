package com.codingbat.array;

public class SameEnds {
	public static boolean sameEnds(int[] nums, int len) {
		boolean result = true;
		int range = len;
		//Now translate the conditions, 
		//little bit tricky, but you can manage it!
		for (int i =0; i <range;i++)
		if (!(nums[i] == nums[nums.length - range + i]))
		result = false;

		return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 2));
	}

}
