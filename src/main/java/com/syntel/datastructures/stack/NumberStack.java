package com.syntel.datastructures.stack;

public class NumberStack {
	private int[] stack;
	private int top;
	int maxSize;

	public NumberStack(int size) {
		maxSize = size;
		stack = new int[size];
		top = -1;
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			stack[top] = element;
		} else {
			System.out.println("stack is full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int old_top = top;
			top--;
			return stack[old_top];
		} else {
			System.out.println("stack is empty");
			return -1;
		}

	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return !(top >= 0);
	}

	public int peek() {
		if (!isEmpty()) {
			return stack[top];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
}
