package com.codingbat.recursion;

public class ChangeXY {
	static String changeXY(String str) {
		if (str.length() == 0) {
			return str;
		} else if (str.charAt(0) == 'x') {
			return "y"+changeXY(str.substring(1));
		} else {
			return str.charAt(0)+changeXY(str.substring(1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changeXY("codex"));
	}

}
