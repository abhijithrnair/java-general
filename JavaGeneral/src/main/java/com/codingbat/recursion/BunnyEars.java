package com.codingbat.recursion;

public class BunnyEars {
	static int findEars(int n) {
		int result=0;
		if(n==0) {
			result = 0;
		}
		else if(n==1) {
			result = 2;
		}
		else {
			result+=findEars(n-1);
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BunnyEars.findEars(5));
	}

}
