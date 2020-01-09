package com.dsa.hackerrank.arrayHashmap;

import java.util.HashSet;

public class CommonSubString {
	static String commonSubString(String s1, String s2) {
		String result = "";
		HashSet<Character> hashSet1 = new HashSet<Character>();
		char[] charArray1 = s1.toCharArray();
		for (int i = 0; i < charArray1.length; i++) {
			hashSet1.add(charArray1[i]);
		}
		HashSet<Character> hashSet2 = new HashSet<Character>();
		char[] charArray2 = s2.toCharArray();
		for (int i = 0; i < charArray2.length; i++) {
			hashSet2.add(charArray2[i]);
		}
		for (char ch : hashSet1) {
			if (hashSet2.contains(ch)) {
				result = "YES";
				break;
			} else {
				result = "NO";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "hello";
		System.out.println(commonSubString(s1, s2));
	}

}
