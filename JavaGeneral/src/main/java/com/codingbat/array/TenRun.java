package com.codingbat.array;

public class TenRun {
	public static int[] tenRun(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];
			if(nums[i]%10==0) {
				for (int j = i+1;j<nums.length; j++) {
					if(nums[j]%10==0) {
						nums[j]=nums[j];
						val =nums[j];
					}
					else {
						nums[j]=val;
					}
				}
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] =tenRun(new int[] { 2, 10, 3, 4, 20, 5 });
		for(int a:num)
		System.out.print(" "+a);
	}

}
