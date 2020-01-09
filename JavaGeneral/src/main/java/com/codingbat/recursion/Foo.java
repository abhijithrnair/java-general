package com.codingbat.recursion;

public class Foo {
	static void foo() {
		bar();
		System.out.println("In Foo Method");
	}
	static void bar() {
		work();
		System.out.println("In Bar Method");
	}
	static void work() {
		doMoreWork();
		System.out.println("In Work Method");
	}
	static void doMoreWork() {
		System.out.println("In doMoreWork Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo.foo();
		System.out.println("In Main Method");
	}

}
