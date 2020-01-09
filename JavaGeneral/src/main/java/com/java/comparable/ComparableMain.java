package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("Dell", 16, 800));
		laptop.add(new Laptop("Apple", 12, 1200));
		laptop.add(new Laptop("Lenovo", 8, 800));
		
		Collections.sort(laptop);
		for(Laptop lap:laptop)
			System.out.println(lap);
	}

}
