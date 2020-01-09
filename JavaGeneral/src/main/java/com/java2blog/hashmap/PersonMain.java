package com.java2blog.hashmap;

import java.util.HashMap;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(31, "Abhijith");
		Person p2 = new Person(25, "Reshma");
		Person p3 = new Person(29, "Abhijith");
		HashMap<Person, Integer> personMap = new HashMap<Person, Integer>();
		personMap.put(p1, 97);
		personMap.put(p2, 68);
		personMap.put(p3, 38);
		System.out.println(personMap.get(new Person(29, "Abhijith")));
	}

}
