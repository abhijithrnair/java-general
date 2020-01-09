package com.dsa.hackerrank.array;


public class Reverse {
	
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[b.length-1-i]=a[i];
		}
		for(int num:b)
		System.out.print(num);
	}

}
