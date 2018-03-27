package com.syntel.datastructures.stack;

public class AppStack {
	public static void main(String[] args) {
		Stack stack=new Stack(10);
		stack.push(10);
		stack.push(5);
		stack.push(8);
		stack.push(7);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(1);
		
		
	}

}
