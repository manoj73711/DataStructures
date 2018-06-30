package com.syntel.datastructures.queue.myimpl;

public class QueueApp {
	public static void main(String[] args) {
		
		Queue qu=new Queue(5);
		qu.insert(12);
		qu.insert(123);
		qu.insert(125);
		qu.insert(126);
		qu.insert(123);
		qu.insert(12);
		qu.view();
		
	}

}
