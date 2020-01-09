package com.practice.intrface;

interface Left1{
	static void m1() {
		System.out.println("Left m1");
	}
}


public class StaticMethodDemo implements Left1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Left1.m1();
		
	}


}
