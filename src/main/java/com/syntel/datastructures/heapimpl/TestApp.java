package com.syntel.datastructures.heapimpl;

public class TestApp {
	
	public static void main(String[] args) {
		
		Heap heap=new Heap(5);
		heap.insert(10);
		heap.printHeap();
		System.out.println("*********");
		heap.insert(6);
		heap.printHeap();
		System.out.println("*********");
		heap.insert(5);
		heap.printHeap();
		System.out.println("*********");
		heap.insert(4);
		System.out.println("*********");
		heap.insert(11);
		heap.printHeap();
		System.out.println("**77*******");
		//heap.insert(20);
		
		heap.removeMaxNode();
		heap.printHeap();
		System.out.println("*********");
		heap.removeMaxNode();
		heap.printHeap();
		System.out.println("*********");
	}

}
