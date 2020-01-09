package com.practice.foreach;

interface A{
	void call();
}

class B implements A{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("CALL");
	}
	
}
public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
//		obj = new B();
		obj = new A() {
			
			@Override
			public void call() {
				// TODO Auto-generated method stub
				System.out.println("Hai A");
			}
		};
		obj = () -> {System.out.println("Hai");};
		obj.call();
	}

}
