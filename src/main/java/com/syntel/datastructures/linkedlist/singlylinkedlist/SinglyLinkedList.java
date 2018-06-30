package com.syntel.datastructures.linkedlist.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	private Node last;

	public SinglyLinkedList() {

	}

	public boolean isEmpty() {
		return (first == null);
	}

	// used to insert at the begginging of the list
	public void insertFirst(int data) {
		
		//Create a new node
		Node newNode = new Node();
		newNode.data = data;
		
		//link the new node
		newNode.nextNode = first;
		first = newNode;
		
		//This block is to update the last Node in the list
		if (first.nextNode == null) {
			last = first;
		}
		
	}

	public Node deleteFirst() {
		
		Node currFirst = first;
		first = first.nextNode;
		if(first==null) {
			last=null;
		}
		return currFirst;

	}

	public void displayList() {
		System.out.println("List(first-->last)");
		Node current = first;
		while (current != null) {
			System.out.println(current.data);
			current = current.nextNode;
		}
	}

	public void insertLast(int data) {
		//get the current last node
		Node currlast = last;
		
		//create the node with data
		Node lastNode = new Node();
		lastNode.data = data;
		
		currlast.nextNode=lastNode;
		last=lastNode;
	}

}
