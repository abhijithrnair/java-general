package com.codingbat.array;

public class ZeroFront {
	public static int[] zeroFront(int[] nums) {
		int countZeroes=0;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==0){
		      countZeroes++;
		    }
		  }
		  int[] numsZeroes = new int[nums.length];
		  for(int i=0;i<nums.length;i++){
		     if(nums[i]!=0){
		    numsZeroes[countZeroes]=nums[i];
		    countZeroes++;
		     }
		  }
		  return numsZeroes;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(zeroFront(new int[] {1, 0, 0, 1}));
		System.out.println(1%3);
	}

}
