package com.practice.durgasoft.FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {

	public static int square(int n) {
		return n * n;
	}

	public static void main(String[] args) {
		
		Function<Integer, Integer> square = i -> i * i;
		System.out.println("Sq of 4 is " + square.apply(4));
		
		Function<String, String> string = i -> i.length()>5? "YES":"NO";
		System.out.println("Lenght>5? " + string.apply("ABHIJITH"));
//		System.out.println("Sq of 4 is " + square(4));
//		System.out.println("Sq of 5 is " + square(5));
	}

}
