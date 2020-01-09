package com.practice.durgasoft.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = i -> i < 2;
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(1));
		System.out.println(predicate.negate().test(1));
	}

}
