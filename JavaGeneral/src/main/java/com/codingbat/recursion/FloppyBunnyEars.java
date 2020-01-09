package com.codingbat.recursion;

public class FloppyBunnyEars {
	static int findEars(int n) {
		if(n==0) {
			return 0;
		}
		else {
			  return 2 + findEars(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FloppyBunnyEars.findEars(2));
	}

}
