package com.codingbat.recursion;

public class EndX {
	public static String endX(String str) {
		if (str.equals("") || str.length() == 1)
			return str;
		if (str.charAt(0) == 'x')
			return endX(str.substring(1))+str.charAt(0);
		else
			return str.charAt(0)+endX(str.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(EndX.endX("hixxxx"));
	}

}
