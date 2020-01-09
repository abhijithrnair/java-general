package com.codingbat.recursion;

public class ParenBit {
	public static String parenBit(String str) {
		if (str.equals(""))
			return str;
		if (str.charAt(0) == '(') {
			if (str.charAt(str.length() - 1) == ')')
				return str;
			else
				return parenBit(str.substring(0, str.length() - 1));
		} else
			return parenBit(str.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ParenBit.parenBit("abc(hello)abc"));
	}

}
