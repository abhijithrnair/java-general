package com.practice.streams;

import java.util.ArrayList;
import java.util.List;

public class CommaSeparatedString {
	public static String getString(List<Integer> list) {
		list.stream().map(x->(x%2==0)?"e"+x:"o"+x).forEach(i ->System.out.print(" "+i));
		return list.stream().map(x->(x%2==0)?"e"+x:"o"+x).toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		getString(list);
	}

}
