package com.syntel.datastructures.graphs;

import java.util.LinkedList;

public class Vertex {
	String data;
	LinkedList<Integer> list;
	
	public Vertex(String place) {
		data=place;
		list=new LinkedList<Integer>();
	}

}
