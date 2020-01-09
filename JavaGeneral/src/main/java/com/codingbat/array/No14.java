package com.codingbat.array;

public class No14 {
	public static boolean no14(int[] nums) {
		boolean containsNoOnes=true, containsNoFours=true;  //We assume we don't have any 1's or 4's.
		    for (int i : nums) {
		        if(i==1) {
		        	containsNoOnes = false;                //If we find a 1, then false.
		        }
		        if(i==4) {
		        	containsNoFours = false;               //If we find a 4, then false.
		        }

		    }       
		    return containsNoOnes || containsNoFours;           //If array did not contain any 1's return true. 
		                                                        //Or if array did not contain any 4's, return true;                                                           
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(no14(new int[] {1, 2, 3, 4}));
	}

}
