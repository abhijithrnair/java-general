package com.codingbat.array;

public class CenteredAverage {
	public static int centeredAverage(int[] nums) {
		int big = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		int bigIndex=Integer.MIN_VALUE;
		int smallIndex=Integer.MIN_VALUE;
		int i=0;
		for (int a : nums) {
			if (a >= big) {
				big = a;
				bigIndex=i;
			}
			if (a < small) {
				small = a;
				smallIndex=i;
			}
			i++;
		}
		int sum=0;
		for(int j=0;j<=nums.length-1;j++) {
			if(j!=bigIndex && j!=smallIndex) {
				sum+=nums[j];
			}
		}
		return sum/(nums.length-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(centeredAverage(new int[] {7, 7, 7 }));
	}

}
