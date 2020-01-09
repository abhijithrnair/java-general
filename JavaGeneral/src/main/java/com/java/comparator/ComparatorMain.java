package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("Dell", 16, 800));
		laptop.add(new Laptop("Apple", 12, 1200));
		laptop.add(new Laptop("Lenovo", 8, 800));
//		Comparator<Laptop> com = new Comparator<Laptop>() {
//			@Override
//			public int compare(Laptop o1, Laptop o2) {
//				if(o1.getPrice()>o2.getPrice()) {
//					return 1;
//				}
//				else {
//					return -1;
//				}
//			}
//		};
		Comparator<Laptop> com = (Laptop o1, Laptop o2 ) -> o1.getPrice()>o2.getPrice()?1:-1;
		
		Collections.sort(laptop,com);
		for(Laptop lap:laptop)
			System.out.println(lap);
	}

}

