package com.practice.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		// 1. Integer Stream
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
//
		// 2. Integer Stream with skip
		IntStream.range(1, 10).skip(5).forEach(System.out::print);
		System.out.println();
//
		// 3. Integer Stream with sum
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();
//
		// 4. Stream.of, sorted and findFirst
		Stream.of("Zuvaris", "Pushpan", "Deepu", "Chicholi", "Abhijith").sorted().findFirst()
				.ifPresent(System.out::print);
		System.out.println();
//
		// 5. Stream from Array, sort, filter and print
		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah" };
		Arrays.stream(names).filter(x -> x.startsWith("S")).findFirst().ifPresent(System.out::print);
		System.out.println();
		
		// 6. average of squares of an int array
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::print);
//
		// 7. Stream from List, filter and print
		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
//
		// 13. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);
		int result = Stream.of(7, 1, 8).reduce(0, Integer::sum);
		System.out.println(result);
//
//		 14. Reduction - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
		System.out.println(summary);

	}
}
