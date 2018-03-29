package com.syntel.datastructures.stack;

public class CharStack {
	private char[] stack;
	private int top;
	int maxSize;

	public CharStack(int size) {
		maxSize = size;
		stack = new char[size];
		top = -1;
	}

	public void push(char element) {
		if (!isFull()) {
			top++;
			stack[top] = element;
		} else {
			System.out.println("stack is full");
		}
	}

	public char pop() {
		if (!isEmpty()) {
			int old_top = top;
			top--;
			return stack[old_top];
		} else {
			System.out.println("stack is empty");
			return '0';
		}

	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return !(top >= 0);
	}

	public char peek() {
		if (!isEmpty()) {
			return stack[top];
		} else {
			System.out.println("Stack is Empty");
			return '0';
		}
	}
}
