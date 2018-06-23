package com.syntel.datastructures.stack;

public class NumberStack {
	private int[] stack;
	private int top;
	private int maxSize;

	public NumberStack(int size) {
		maxSize = size;
		stack = new int[size];
		top = -1;
	}

	public void push(int element) {

		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			stack[top] = element;
		}
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("Stack is empty to pull any details");
			return -1;
		} else {
			int old_top = top;
			top--;
			return stack[old_top];

		}

	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return !(top >= 0);
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty to peek");
			return -1;
		} else {
			return stack[top];

		}
	}
}
