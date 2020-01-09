package com.practice.intrface;

interface Left{
	default void m1() {
		System.out.println("Left m1");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right m1");
	}
}

public class InterfaceDemo1 implements Left, Right{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
	}


}
