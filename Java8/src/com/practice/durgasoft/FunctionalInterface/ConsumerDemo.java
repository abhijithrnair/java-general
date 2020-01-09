package com.practice.durgasoft.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer1 = s ->System.out.println(s);;
		Consumer<String> consumer2 = s ->System.out.println("consumer1 "+s);;
		Consumer<String> consumer3 = consumer1.andThen(consumer2);
		consumer3.accept("ABHIJITH");
	}

}
