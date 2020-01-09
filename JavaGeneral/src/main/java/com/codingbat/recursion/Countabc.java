package com.codingbat.recursion;

public class Countabc {
	public static int countAbc(String str) {
		  if("".equals(str) || str.length()<3){
		    return 0;
		  }
		  else if(str.charAt(0)=='a'&&str.charAt(1)=='b'&&(str.charAt(2)=='c' || str.charAt(2)=='a')) {
		    return 1+countAbc(str.substring(2));
		  }
		  else{
		     return countAbc(str.substring(1));
		  }
		}

	public static void main(String[] args) {
		System.out.println(Countabc.countAbc("ababc"));
	}

}
