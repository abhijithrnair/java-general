package com.practice.journaldev.method.reference;

public class Utils {

	public static int countElements(Object[] array) {
		return array.length;
	}

	public static void main(String args[]) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };

// lambda expression
		Counter counter = Utils::countElements;//array -> Utils.countElements(array);
		System.out.println(counter.count(intArray)); // 5


	}
}
