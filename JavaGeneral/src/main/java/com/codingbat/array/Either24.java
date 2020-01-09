package com.codingbat.array;

public class Either24 {
	public static boolean either24(int[] nums) {
		  boolean twoNextToTwo = false;
		  boolean fourNextToFour = false;
		  for(int i=0;i<nums.length-1;i++){
		    if((nums[i]==2 && nums [i+1]==2)){
		      twoNextToTwo=true;
		    }
		    else if((nums[i]==4 && nums [i+1]==4)){
		      fourNextToFour=true;
		    }
		  }
		  return !twoNextToTwo || fourNextToFour;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(either24(new int[] {4, 4, 1, 2, 2}));
	}

}
