package com.java.designpatterns.singleton;

public class SingletonDemo {
	private static SingletonDemo instance = null;

	// variable of type String
	public String s;

	// private constructor restricted to this class itself
	private SingletonDemo() {
		s = "Hello I am a string part of Singleton class";
	}

	public static SingletonDemo getInstance() {
		if (instance == null)
			instance = new SingletonDemo();
		return instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instantiating Singleton class with variable x
		SingletonDemo x = SingletonDemo.getInstance();

		// instantiating Singleton class with variable y
		SingletonDemo y = SingletonDemo.getInstance();

		// instantiating Singleton class with variable z
		SingletonDemo z = SingletonDemo.getInstance();

		// changing variable of instance x
		x.s = (x.s).toUpperCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// changing variable of instance z
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		
		
		//illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	}

}
