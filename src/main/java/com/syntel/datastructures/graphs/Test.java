package com.syntel.datastructures.graphs;

public class Test {
	public static void main(String[] args) {
		MyGraph graph=new MyGraph(4);
		graph.addPlace("phl");
		graph.addPlace("tampa");
		graph.addPlace("miami");
		graph.addPlace("oralando");
		
		graph.addRoutes("phl", "tampa");
		graph.addRoutes("tampa", "miami");
		graph.addRoutes("tampa", "orlando");
		
		graph.printConnectingPlaces("tampa");
	}

}
