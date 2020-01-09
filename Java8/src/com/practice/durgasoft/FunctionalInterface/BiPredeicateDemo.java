package com.practice.durgasoft.FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredeicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> sumAndEven = (a,b)->((a+b)%2==0)?true:false;
		System.out.println(sumAndEven.test(2, 4));

	}

}
