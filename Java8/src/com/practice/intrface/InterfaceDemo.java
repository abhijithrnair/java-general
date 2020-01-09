package com.practice.intrface;

@FunctionalInterface
interface Phone {
	void call();
	static void browse() {
	}
	default void message() {
		System.out.println("Messaging from Phone");
	}
}

@FunctionalInterface
interface Pager extends Phone {
	default void message() {
		System.out.println("Messaging from Pager");
	}
}

class AndroidPhone implements Phone,Pager {

	@Override
	public void call() {
		System.out.println("Calling");
	}

	@Override
	public void message() {
		System.out.println("message in andru");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}

}
