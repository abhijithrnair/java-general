package com.codingbat.recursion;

public class Array11 {
	static int array11(int[] nums, int index) {
		   if(nums.length==0 || index>nums.length-1){
		    return 0;
		  }
		  else if(nums[index]==11){
		    return 1+ array11(nums,index+1);
		  }
		  else if(nums.length>index+1){
		    return array11(nums,index+1);
		  }
		  else{
		    return 0;
		  }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Array11.array11(new int[] {1,2,11}, 0));
	}

}
