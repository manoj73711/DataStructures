package com.syntel.datastructures.queue.myimpl;

public class Queue {

	private long[] queueArray;
	private int front;
	private int rear;
	private int maxSize;
	private int nItems;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queueArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long x) {
        if(rear==maxSize-1) {
        	rear=-1;
        }
        if(nItems!=maxSize) {
		rear++;
		queueArray[rear] = x;
		nItems++;
        }
        else {
        	System.out.println("No slots available in the queue");
        }
	}

	public void view() {
		for (int i = 0; i < queueArray.length; i++) {
			System.out.println(queueArray[i] + " ");
		}
	}

	public long remove() {// remove item from the front of the queue
		long value = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0; // we can front back to the 0th so that we can utilize the entire array again
		}
		nItems--;
		return value;

	}

	public long peekFront() {
		return queueArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}
}
