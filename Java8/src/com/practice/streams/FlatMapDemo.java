package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = Arrays.asList("a", "b");
		List<String> l2 = Arrays.asList("c", "d");

		List<String> betterLetters = Stream.of(l1, l2).flatMap(List::stream).map(String::toUpperCase).collect(Collectors.toList());
		betterLetters.forEach(System.out::print);

	}
}
