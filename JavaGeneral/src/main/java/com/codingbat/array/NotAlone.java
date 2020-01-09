package com.codingbat.array;

public class NotAlone {
	public static int[] notAlone(int[] nums, int val) {
		  for(int i=0;i<nums.length-1;i++){
		    if(nums[i]==val){
		      if(i+1<=(nums.length) && i-1>=0){
		        int max = Math.max(nums[i+1],nums[i-1]);
		        nums[i]=max;
		    }
		  }
		  }
		  return nums;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(notAlone(new int[] {1, 1, 1, 2}, 1));
	}

}
