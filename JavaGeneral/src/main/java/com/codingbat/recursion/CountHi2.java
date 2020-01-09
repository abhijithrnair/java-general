package com.codingbat.recursion;

public class CountHi2 {
	public static int countHi2(String str) {
		int len = str.length();
		  if (len < 2) return 0;
		  if (str.substring(len-2, len).equals("hi")) {
		    if ((len > 2 && str.charAt(len-3) != 'x') || len == 2 )
		      return 1 + countHi2(str.substring(0, len-1));
		  }
		  return countHi2(str.substring(0, len-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CountHi2.countHi2("hixhhi"));
	}

}
