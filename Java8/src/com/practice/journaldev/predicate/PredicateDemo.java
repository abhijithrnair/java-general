package com.practice.journaldev.predicate;

//Java program to illustrate 
//passing Predicate into function 

import java.util.function.Predicate; 
public class PredicateDemo { 
	static void pred(int number, Predicate<Integer> predicate) 
	{ 
		if (predicate.test(number)) { 
			System.out.println("Number " + number +" passed predicate"); 
		} 
		else {
			System.out.println("Number " + number +" dint pass predicate");
		}
	} 
	public static void main(String[] args) 
	{ 
		pred(1, (i) -> i > 7); 
	} 
} 
