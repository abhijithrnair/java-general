package com.codingbat.recursion;

public class CountPairs {
	public static int countPairs(String str) {
		  if("".equals(str) || str.length()==0){
		    return 0;
		  }
		  else if(str.length()>2 && str.charAt(0)==str.charAt(2)){
		    return 1+countPairs(str.substring(1));
		  }
		  else {
		    return countPairs(str.substring(1));
		  }
		}

	public static void main(String[] args) {
		System.out.println(CountPairs.countPairs("axa"));
	}

}
