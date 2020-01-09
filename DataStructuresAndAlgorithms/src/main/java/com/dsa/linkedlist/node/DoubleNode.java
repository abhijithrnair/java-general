package com.dsa.linkedlist.node;

public class DoubleNode {

	private int data;
	private DoubleNode prev;
	private DoubleNode next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoubleNode getNext() {
		return next;
	}
	public void setNext(DoubleNode next) {
		this.next = next;
	}
	public DoubleNode getPrev() {
		return prev;
	}
	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}
	@Override
	public String toString() {
		return "DoubleNode [data=" + data + ", prev=" + prev + ", next=" + next + "]";
	}
	
}
