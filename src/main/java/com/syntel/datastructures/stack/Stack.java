package com.syntel.datastructures.stack;

public class Stack {
	private int[] stack;
	private int cursor;

	public Stack() {
		stack = new int[10];
	}

	public void push(int element) {
		stack[cursor] = element;
		cursor++;
	}

	public int pop() {
		 int c=stack[cursor-1];
		 cursor--;
		 return c;
		
	}
}
