package com.practice.durgasoft.FunctionalInterface;

import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

public class IntPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPredicate intPredicate = (i) -> i==0?true:false;
		ToIntFunction<String> test = s->s.length();
		System.out.println(intPredicate.test(0));
		System.out.println(test.applyAsInt("ABHIJITH"));
	}

}
