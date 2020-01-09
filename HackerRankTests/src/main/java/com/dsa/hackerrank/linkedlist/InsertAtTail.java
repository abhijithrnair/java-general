package com.dsa.hackerrank.linkedlist;

import java.io.*;
import java.util.*;

public class InsertAtTail {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;

		public SinglyLinkedList() {
			this.head = null;
		}

	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	// Complete the insertNodeAtTail function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		if (head == null) {
			head = newNode;
			return head;
		}
		SinglyLinkedListNode currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		currentNode.next = newNode;
		return head;
	}

	public static void main(String[] args) throws IOException {
		SinglyLinkedList llist = new SinglyLinkedList();
	}
}
