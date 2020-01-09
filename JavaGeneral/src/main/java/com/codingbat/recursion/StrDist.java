package com.codingbat.recursion;

public class StrDist {
	public static int strDist(String str, String sub) {
		return func(str, sub).length();
	}

	private static String func(String str, String sub) {
		int strlen = str.length();
		int sublen = sub.length();
		if (str.equals(""))
			return str;
		if (str.startsWith(sub)) {
			if (str.substring(strlen - sublen, strlen).equals(sub))
				return str;
			else
				return func(str.substring(0, strlen - 1), sub);
		} else
			return func(str.substring(1), sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strDist("cccatcowcatxx", "cat"));
	}

}
