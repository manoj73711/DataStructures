package com.syntel.datastructures.linkedlist.circularlinkedlist;

public class CircularLinkedList {
	
	private Node first;
	private Node last;

	
	public CircularLinkedList() {
		first=null;
		last=null;
	}
	
	
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		if(isEmpty()) {
			last=newNode;
		}
		newNode.nextNode=first; // newNOde -->old first
		first=newNode;
	}
	
	
	public void insertLast(int data) {
		Node newNode=new Node();
		newNode.data=data;
		
		if(isEmpty()) {
			last=newNode;
			first=newNode;
		}
		else {
		last.nextNode=newNode;
		last=newNode;
		}
			
		}
		
		public int deleteFirst() {
			int temp=first.data;
			if(first.nextNode==null) {
				last=null;
			}
			
			first=first.nextNode;
			return temp;
		}
		
	
	public boolean isEmpty() {
		return first==null;
	}
}
