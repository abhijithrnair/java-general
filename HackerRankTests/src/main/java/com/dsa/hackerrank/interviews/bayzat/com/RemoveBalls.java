package com.dsa.hackerrank.interviews.bayzat.com;

public class RemoveBalls {
	/**
	 * recursive method to find the number of ways balls can be removed
	 * @param n - number of balls
	 * @return int - number of ways balls can be removed
	 */
	public static int ways (int n) {
		if(n==0 || n==1 || n==2) {
			return n; //base condition
		}
		else {
			return  ways(n-1) + ways(n-2); //recursion
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ways(10));
	}

}
