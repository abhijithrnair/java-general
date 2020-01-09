package com.practice.durgasoft.lamdaexp;

@FunctionalInterface
interface Square{
	int m1(int n);
}
public class LamdaExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = (n)->n*n;
		System.out.println("Sq of 4 is "+sq.m1(4));
		System.out.println("Sq of 5 is "+sq.m1(5));
		System.out.println("Sq of 6 is "+sq.m1(6));
	}
}
