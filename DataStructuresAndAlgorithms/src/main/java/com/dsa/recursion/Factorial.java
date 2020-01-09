package com.dsa.recursion;

public class Factorial {

	public static void main(String[] args) {
		int fact = fact(5);
		System.out.println(fact);
	}

	private static int fact(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
}
