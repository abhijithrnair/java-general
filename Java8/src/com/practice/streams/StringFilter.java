package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	public static List<String> search(List<String> list) {
		return list.stream().filter(x->x.toLowerCase().startsWith("a")).filter(x->x.length()==3).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("CBC");
		list.add("atm");
		List<String> result = search(list);
		for(String a: result) {
			System.out.println(a);
		}
	}

}
