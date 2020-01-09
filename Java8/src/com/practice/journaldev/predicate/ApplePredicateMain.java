package com.practice.journaldev.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ApplePredicateMain {
	public static Predicate<Apple> isWeightAbove150() {
		return apple -> apple.getWeight() >= 150;
	}

	public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
		return apples.stream().filter(predicate).collect(Collectors.toList());
	}

	public static Predicate<Apple> isColorGreen() {
		return apple -> apple.getColor().equals("green");
	}

	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("green", 120.0), new Apple("red", 110.0),
				new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));
		filterApples(apples, isWeightAbove150()).forEach(System.out::println);

		Predicate<Apple> andPredicate = isColorGreen().and(isWeightAbove150());
		apples.stream().filter(andPredicate).forEach(System.out::println);

		Predicate<Apple> orPredicate = isColorGreen().or(isWeightAbove150());
		apples.stream().filter(orPredicate).forEach(System.out::println);

		Predicate<Apple> negateExample = isColorGreen().negate();
		apples.stream().filter(negateExample).forEach(System.out::println);

		Apple testApple = new Apple("green", 120.0);
		System.out.println(isColorGreen().test(testApple));
		System.out.println(isWeightAbove150().test(testApple));

	}

}
