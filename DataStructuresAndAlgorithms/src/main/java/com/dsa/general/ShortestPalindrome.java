//package com.dsa.general;
//
//public class ShortestPalindrome {
//	 public static int shortestPalindrome(char str, int l, int h) {
//		    // Write your code here
//		    if(l>h) return Integer.MAX_VALUE;
//		    if(l==h) return 0;
//		    if(l==h-1) return (str[l]==str[h])?0:1;
//
//		    return((str[l]==str[h])?shortestPalindrome(str,l+1,h-1):(Integer.min(shortestPalindrome(str,l,h-1),shortestPalindrome(str,l+1,h))+1));
//		    }
//}
