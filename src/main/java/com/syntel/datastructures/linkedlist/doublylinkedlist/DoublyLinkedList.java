package com.syntel.datastructures.linkedlist.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;

	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			last = newNode;
		} else {
			first.prevNode = newNode;
		}

		newNode.nextNode = first;
		first = newNode;
	}

	public void insertLast(int data) {

		Node newNode = new Node();
		newNode.data = data;

		if (isEmpty()) {
			first = newNode;
		} else {
			last.nextNode = newNode;// assign old last to new last
			newNode.prevNode = last; // the old last wil be newnodes previous

		}
		last = newNode;

	}

	// assume non-empty list
	public Node deleteFirst() {
		Node temp = first;
		if (first.nextNode == null) {
			last = null;
		} else {
			first.nextNode.prevNode = null;
		}
		first = first.nextNode;
		return temp; // return the deleted old first node
	}

	// assume non-empty list
	public Node deleteLast() {

		Node temp = last;

		if (first.nextNode == null) { // we only have one node
			first = null;
		} else {
			last.prevNode.nextNode = null;

		}
		last = last.prevNode;
		return temp;

	}

	// assume non-empty list
	public boolean insertAfter(int key, int data) {

		Node current = first; // we start from the beggining of the list

		while (current.data != key) {
			current = current.nextNode;
			if (current == null) {
				return false;
			}
		}

		Node newNode = new Node();
		newNode.data = data;

		if (current == last) {
			current.nextNode = null;
			last = newNode;
		} else {
			newNode.nextNode = current.nextNode;
			current.nextNode.prevNode = newNode;
		}

		newNode.prevNode = current;
		current.nextNode = newNode;

		return true;

	}

	// assume non-empty list

	public Node deleteKey(int key) {
		Node current = first; // we start from the beggining of the list

		while (current.data != key) {
			current = current.nextNode;
			if (current == null) {
				return null;
			}
		}
		if (current == first) {
			first = current.nextNode;
		} else {
			current.prevNode.nextNode = current.nextNode;
		}
		if (current == last) {
			last = current.prevNode;
		} else {
			current.nextNode.prevNode = current.prevNode;
		}

		return current;

	}
	
	public void displayForward() {
		System.out.println("Display First node -> Last Node");
		Node current=first;
		while (current!=null) {
			System.out.println("Element :"+ current.data);
			current=current.nextNode;
		}
	}
}
