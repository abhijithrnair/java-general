package com.practice.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  values = Arrays.asList(4,5,6,7,8);
		values.forEach(i ->System.out.print(" "+i)); //Lamba Consumer interface
		
		Consumer<Integer> c = (i)->System.out.println("Hai from accept() "+ i);
		values.forEach(c);
	}

}
