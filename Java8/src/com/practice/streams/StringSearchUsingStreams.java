package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StringSearchUsingStreams {
	public static Optional<String> search(List<String> nameList, String name) {
		return nameList.stream().filter(s->s.equals(name)).findFirst();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<String>();
		nameList.add("Abhijith");
		nameList.add("Reshma");
		nameList.add("Sivakumar");
		nameList.add("Girija");
		System.out.println(search(nameList, "Girija"));
	}

}
