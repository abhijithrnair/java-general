package com.practice.durgasoft.lamdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsLamdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<=100;i++) {
			list1.add(i);
		}
		System.out.println(list1);
		Predicate<Integer> predicate1 = i->i%2==0;
		Predicate<Integer> predicate2 = i->i<50;
		List<Integer> list2 = list1.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList());
		System.out.println(list2);
	}

}
