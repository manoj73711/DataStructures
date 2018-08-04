package com.syntel.datastructures.graphs;

import java.util.LinkedList;

public class MyGraph {
	int noOfplaces;
	Vertex[] a;
	int counter=0;
	
	public MyGraph(int number) {
		noOfplaces=number;
		a=new Vertex[noOfplaces];
	}
	
	public void addPlace(String city) {
		a[counter]=new Vertex(city);
		counter++;
	}
	public void addRoutes(String source, String dest) {
		int sourceIndex=0;
		int destIndex=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i].data.equals(source)) {
				sourceIndex=i;
			}
			if(a[i].data.equals(dest)) {
				destIndex=i;
			}	
		}
		
		a[sourceIndex].list.add(destIndex);
		
	}
	
	public void printConnectingPlaces(String placeName) {
		for (int i = 0; i < a.length; i++) {
			if(a[i].data.equals(placeName)) {
				LinkedList<Integer> listOfPlaces = a[i].list;
				for (Integer integer:listOfPlaces) {
					System.out.println(a[integer].data);
				}
			}
		}

	}
	
	

}
