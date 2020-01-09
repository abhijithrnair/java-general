package com.dsa.linkedlist.single;

import com.dsa.linkedlist.node.SingleNode;

public class SingleLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SingleNode createLinkedList(int value) {
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setData(value);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	public boolean isLinkedListexists() {
		return head!=null;
	}
	
	public void insertNode(int value, int location) {
		if(!isLinkedListexists()) {
			System.out.println("Linked List doesnt exist");
		}
		SingleNode node = new SingleNode();
		node.setData(value);
		if(location==0) {
			node.setNext(head);
			head=node;
		}
		else if(location==getSize()) {
			tail.setNext(node);
			node.setNext(null);
			tail = node;
		}
		else {
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		setSize(getSize()+1);
	}
	
	public void traverse() {
		if(!isLinkedListexists()) {
			System.out.println("Linked List doesnt exist");
		}
		else {
			System.out.println();
			SingleNode tempNode = head;
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
			SingleNode tempNode = head;
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
		if(location ==0) {
			head = head.getNext();
		}
		else if (location ==getSize()) {
			SingleNode tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.getNext(); //temp node points to 2nd last node
			}
			if(tempNode==head) {
				head = null;
				tail = null;
				setSize(getSize()-1);
				return;
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize()-1);
		}
		else {
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			tempNode.setNext(tempNode.getNext().getNext());
			setSize(getSize()-1);
		}
	}
}
