package com.manoj.DataStructures.Queue;

public class Queue {
	int[] a;
	int size;
	int front;
	int rear;

	public Queue(int size) {
		a = new int[size];
		this.size = size;
	}

	public void push(int x) {
		if(rear==size-1&& front!=0){
			rear=-1;
		}
		if(!(++rear==front)){
			a[++rear]=x;
			rear++;
		}
		 else {
			System.out.println("Queue is full cannot be added");
		}
	}

	public int pop() {
		if(front==size-1)
			front=0;
		if(front==rear){
			int elem=a[front];
			a[front]=0;
			return elem;
		}
		else{
			int elem=a[front];
			front++;
			return elem;
		}		
	}
}
