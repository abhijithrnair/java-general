package com.dsa.hackerrank.java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		String reverse="";
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			reverse+=charArray[i];
		}
		System.out.println(reverse);
	}

}
