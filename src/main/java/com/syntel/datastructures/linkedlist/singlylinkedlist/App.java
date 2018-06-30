package com.syntel.datastructures.linkedlist.singlylinkedlist;

public class App {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(23);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(235);
		list.insertFirst(2354);
		list.displayList(); 
		list.insertLast(99999);
		list.insertLast(99999);
		list.insertLast(99999);
		list.displayList();

	}

	// This is a task to get lenght of the nodes
	public static int getLengthOfNode(Node n) {
		int length = 0;

		while (n != null) {
			length++;
			n = n.nextNode;
		}

		return length;

	}

}
