package com.manoj.DataStructures.stack;

public class Stack {
	long[] l;
	int pointer;

	public Stack(int size) {
		l = new long[size];
		pointer = -1;
	}

	public void add(long ele) {
		if (pointer == l.length - 1) {
			reGrow();
			l[++pointer] = ele;
		} else
			l[++pointer] = ele;
	}

	public long pop() {
		if (!isEmpty()) {
			long ele = l[pointer];
			pointer--;
			return ele;
		} else
			System.out.println("Stack is empty");
		return l[pointer];
	}

	public long peek() {
		if (isEmpty()) {
			System.out.println("No Element to peek");
		}
		return l[pointer];
	}

	public void reGrow() {
		long[] l2 = new long[l.length * 2];
		for (int i = 0; i < l.length; i++) {
			l2[i] = l[i];
		}
		l = l2;
	}

	public boolean isEmpty() {
		return !(pointer > 0);
	}
	public static void main(String[] args) {
		Stack s=new Stack(3);
		s.add(345);
		s.add(123);
		s.add(456);
		for(int i=0;i<s.pointer+1;i++){
			System.out.println(s.pop());
		}
		System.out.println(s.pop());
System.out.println("pointer is at"+s.pointer);		
	}
}
