package com.java2blog.hashmap;

import java.util.HashMap;

public class Apple {
	private String color;
	private int weight;

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + weight;
		return result;
	}

	public static void main(String[] args) {
		Apple a1 = new Apple("green", 10);
		Apple a2 = new Apple("red", 20);
		Apple a3 = new Apple("green", 30);
		// hashMap stores apple type and its quantity
		HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
		m.put(a1, 100);
		m.put(a2, 20);
		m.put(a3, 200);

		System.out.println(m.get(new Apple("green",10)));
	}
}