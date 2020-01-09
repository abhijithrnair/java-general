package com.dsa.linkedlist.doublee;

public class DoubleCircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleCircular dcll = new DoubleCircular();
		dcll.traverse();
		dcll.createLinkedList(10);
		dcll.traverse();
		dcll.insertNode(100,1);
		dcll.traverse();
		dcll.search(100);
		dcll.traverse();
		System.out.println(dcll.getSize());
		dcll.deleteNode(100, 1);
		dcll.traverse();
		System.out.println(dcll.getSize());
		dcll.deleteNode(10, 0);
		dcll.traverse();
	}

}
