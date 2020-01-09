package com.dsa.linkedlist.doublee;

import com.dsa.linkedlist.node.DoubleNode;

public class DoubleLinkedList {
	private DoubleNode head;
	private DoubleNode tail;
	private int size;

	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	public DoubleNode getTail() {
		return tail;
	}

	public void setTail(DoubleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public DoubleNode createLinkedList(int value) {
		head = new DoubleNode();
		DoubleNode node = new DoubleNode();
		node.setData(value);
		node.setNext(null);
		node.setPrev(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	public boolean isLinkedListexists() {
		return head!=null;
	}
	
	public void insertNode(int value, int location) {
		DoubleNode node = new DoubleNode();
		node.setData(value);
		
		if(!isLinkedListexists()) {
			System.out.println("Linked List doesnt exist");
		}
		else if(location==0) {
			node.setNext(head);
			node.setPrev(null);
			head.setPrev(node);
			head=node;
		}
		else if(location==getSize()) {
			tail.setNext(node);
			node.setNext(null);
			node.setPrev(tail);
			tail = node;
		}
		else {
			DoubleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			node.setNext(tempNode.getNext());
			node.setPrev(tempNode);
			tempNode.getNext().setPrev(node);
			tempNode.setNext(node);
		}
		size++;
	}
	
	public void traverse() {
		if(!isLinkedListexists()) {
			System.out.println("Traverser error - Linked List doesnt exist");
		}
		else {
			System.out.println();
			DoubleNode tempNode = head;
			for(int i=0;i<getSize();i++) {
				System.out.print(tempNode.getData());
				if (i != getSize() - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();			}
		}
	}
	
	public void search(int value) {
		if(!isLinkedListexists()) {
			System.out.println("Linked List doesnt exist");
		}
		else {
			DoubleNode tempNode = head;
			for(int i=0;i<getSize();i++) {
				if(tempNode.getData()==value) {
					System.out.println("Value "+tempNode.getData()+" found at "+i);
				}
				tempNode = tempNode.getNext();
			}
		}
	}
	
	public void deleteNode(int value, int location) {
		if(!isLinkedListexists()) {
			System.out.println("Linked List doesnt exist");
		}
		else if(location ==0) {
			if (getSize() == 1) { // if this is the only node in this list
				head = tail = null;
				setSize(getSize() - 1);
				return;
			}else {
				head = head.getNext();
				head.setPrev(null);
				setSize(getSize() - 1);
			}
		}
		else if (location >= getSize()-1) {
			tail = tail.getPrev();
			tail.setNext(null);
			setSize(getSize() - 1);
		}
		else {
			DoubleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			tempNode.setNext(tempNode.getNext().getNext());
			tempNode.getNext().setPrev(tempNode);
			setSize(getSize()-1);
		}
	}
}
