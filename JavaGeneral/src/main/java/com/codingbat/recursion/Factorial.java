package com.codingbat.recursion;

public class Factorial {
	static int findFactorial(int number) {
		int result = 0; 
		if(number == 0 || number == 1) {
			result = 1;
		}
		else {
			result = number*(findFactorial(number-1));
		}
		System.out.println("Factorial("+number+") = "+result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial.findFactorial(3);
	}

}
