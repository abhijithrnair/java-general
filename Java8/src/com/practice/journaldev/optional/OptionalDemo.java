package com.practice.journaldev.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listOfStrings = Arrays.asList("Mark", "Howard", "Anthony D'Cornian");
		Optional<String> largeString = listOfStrings.stream().filter(str -> str.length() > 10).findAny();
		largeString.ifPresent(System.out::println);

		Optional<String> veryLargeString = listOfStrings.stream().filter(str -> str.length() > 20).findAny();
		veryLargeString.ifPresent(System.out::println);

		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());

		System.out.println(largeString.get());

		Optional<String> empty1 = Optional.empty();
		System.out.println(empty1.orElse("Default Value"));

		Optional<String> opt = Optional.of("static value");

		Optional<Integer> intOptional = Optional.of(34);
		Optional<Integer> evenIntOptional = intOptional.filter(i -> i % 2 == 0);
		System.out.println(evenIntOptional.orElse(0));

		Optional<Integer> oddIntOptional = intOptional.filter(i -> i % 2 != 0);
		System.out.println(oddIntOptional.orElse(0));

	}

}
