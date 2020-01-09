package com.codingbat.array;

public class IsEverywhere {
	public static boolean isEverywhere(int[] nums, int val) {
		boolean ok= false;
		for (int i = 0; i < nums.length;i++) {
			if(nums[i]==val) {
			if (nums[i] == val && nums[i + 2] == val) {
				ok=true;
			} else {
				ok= false;
			}i=i+1;}
		}
		return ok;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isEverywhere(new int[] {1, 2, 1, 3, 4}, 1));
	}

}
