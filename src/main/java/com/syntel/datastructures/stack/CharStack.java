package com.syntel.datastructures.stack;

public class CharStack {
	private char[] stack;
	private int top;
	private int maxSize;

	public CharStack(int size) {
		maxSize = size;
		stack = new char[size];
		top = -1;
	}

	public void push(char element) {

		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			stack[top] = element;
		}
	}

	public char pop() {

		if (isEmpty()) {
			System.out.println("Stack is empty to pull any details");
			return 0;
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

	public char peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty to peek");
			return 0;
		} else {
			return stack[top];

		}
	}
}
