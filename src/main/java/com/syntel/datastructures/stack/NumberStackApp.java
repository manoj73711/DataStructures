package com.syntel.datastructures.stack;

public class NumberStackApp {
	public static void main(String[] args) {
		NumberStack stack=new NumberStack(10);
		stack.push(10);
		stack.push(5);
		stack.push(8);
		stack.push(7);
		
		while(!stack.isEmpty()) {
			stack.pop();
		}
		
		System.out.println(stack.peek());
	}

}
