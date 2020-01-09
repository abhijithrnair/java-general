package com.dsa.linkedlist.single;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll = new SingleLinkedList();
		sll.traverse();
		sll.createLinkedList(10);
		sll.traverse();
		sll.insertNode(100,1);
		sll.traverse();
		sll.search(100);
		sll.traverse();
	}

}
