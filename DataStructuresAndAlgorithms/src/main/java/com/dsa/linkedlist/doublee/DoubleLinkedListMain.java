package com.dsa.linkedlist.doublee;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.traverse();
		dll.createLinkedList(10);
		dll.traverse();
		dll.insertNode(100,1);
		dll.traverse();
		dll.search(100);
		dll.traverse();
		System.out.println(dll.getSize());
		dll.deleteNode(100, 1);
		dll.traverse();
	}

}
