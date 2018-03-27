package com.syntel.datastructures.stack;

public class Stack {
	private int[] stack;
	private int top;

	public Stack(int size) {
		stack = new int[size];
		top=-1;
	}

	public void push(int element) {
		top++;
		stack[top] = element;
	}

	public int pop() {
		 int old_top=top;
		 top--;
		 return stack[old_top];
		
	}
}
