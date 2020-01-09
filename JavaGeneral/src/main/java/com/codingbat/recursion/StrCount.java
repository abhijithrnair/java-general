package com.codingbat.recursion;

public class StrCount {
	public static int strCount(String str, String sub) {
		if ("".equals(str) || str.length() < sub.length()) {
			return 0;
		} else if (sub.equals(str.substring(0, sub.length()))) {
			return 1 + strCount(str.substring(sub.length()), sub);
		} else {
			return strCount(str.substring(1), sub);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strCount("xyx", "x"));
	}

}
