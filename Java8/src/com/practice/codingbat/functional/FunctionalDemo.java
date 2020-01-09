package com.practice.codingbat.functional;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalDemo {
	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

	public List<String> lower(List<String> strings) {
		strings.replaceAll(x -> x.toLowerCase());
		return strings;
	}

	public List<String> noX(List<String> strings) {
		strings.replaceAll(x -> x.replaceAll("x", ""));
		return strings;
	}

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(n -> n < 0);
		return nums;
	}

	public List<String> noYY(List<String> strings) {
		strings.replaceAll(n -> n + "y");
		strings.removeIf(n -> n.contains("yy"));
		return strings;
	}

	public List<Integer> two2(List<Integer> nums) {
		return nums.stream().map(n -> n * n).filter(n -> n % 10 == 2).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
