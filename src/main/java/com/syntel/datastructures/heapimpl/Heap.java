package com.syntel.datastructures.heapimpl;

public class Heap {

	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public Heap( int maxSize) {
		this.maxSize=maxSize;
		this.heapArray = new Node[maxSize];
		this.currentSize = 0;
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		return !(currentSize==maxSize);
	}
	
	
	public boolean insert(int key) {
		
		if(!isEmpty())
			return false;
		
		trickle(key);
		
		return true;
		
	}

	private void trickle(int key) {
		Node newNode=new Node(key);
		heapArray[currentSize]=newNode;
		
		int currentNodeParent=(currentSize-1)/2;
		int currentNode=currentSize;
		
		while(currentNodeParent>0 && heapArray[currentNodeParent].getKey()<newNode.getKey()) {
			Node temp=heapArray[currentNodeParent];
			heapArray[currentNodeParent]=heapArray[currentNode];
			heapArray[currentNode]=temp;
			currentNode=currentNodeParent;
			currentNodeParent=(currentNodeParent-1)/2;
			
		}
		currentSize++;
		
	}
	
	
	public boolean removeMaxNode() {
		int parent=0;
		currentSize--;
		heapArray[parent]=heapArray[currentSize-1];
		//trickle down 
		while(parent<currentSize/2) {
		int parentLeftChild=2*parent+1;
		int parentRightChild=2*parent+2;
		Node temp=heapArray[parent];
		if(parentLeftChild>parentRightChild) {
			heapArray[parent]=heapArray[parentLeftChild];
			heapArray[parentLeftChild]=temp;
			parent=parentLeftChild;
		}
		else if(parentLeftChild<parentRightChild) {
			heapArray[parent]=heapArray[parentRightChild];
			heapArray[parentRightChild]=temp;	
			parent=parentRightChild;
		}
		}
		return true;
		
	}
	
	
	public void printHeap() {
		for (int i=0; i<currentSize;i++) {
			System.out.println(heapArray[i].getKey());
		}
	}
	
}
