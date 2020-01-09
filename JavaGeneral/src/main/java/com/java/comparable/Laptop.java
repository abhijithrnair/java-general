package com.java.comparable;

public class Laptop implements Comparable<Laptop> {

	private String name;
	private int ram;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
	public Laptop(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	@Override
	public int compareTo(Laptop laptop) {
		if(this.getPrice()>laptop.getPrice()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
