package com.codingbat.recursion;

public class AllStar {
	public static String allStar(String str) {
		  if(str.length()==0){
		    return str;
		  }
		  else{
		    return str.charAt(0)+(str.substring(1).length()==0?"":"*")+allStar(str.substring(1));
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AllStar.allStar("hello"));
	}

}
