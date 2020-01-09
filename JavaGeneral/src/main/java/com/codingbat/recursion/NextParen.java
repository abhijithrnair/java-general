package com.codingbat.recursion;

public class NextParen {
	public static boolean nestParen(String str) {
		if ("".equals(str)) {
			return true;
		} else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' && str.length() >= 2) {
			return nestParen(str.substring(1, str.length() - 1));
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NextParen.nestParen("(()))"));
	}

}
