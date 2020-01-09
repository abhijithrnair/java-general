package com.dsa.linkedlist.single;

public class SingleCircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleCircular scll = new SingleCircular();
		scll.traverse();
		scll.createLinkedList(10);
		scll.traverse();
		scll.insertNode(100,1);
		scll.traverse();
		scll.search(100);
		scll.traverse();
		scll.deleteLinkedList();
		scll.traverse();
	}

}
