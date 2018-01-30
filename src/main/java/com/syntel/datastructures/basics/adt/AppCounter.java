package com.syntel.datastructures.basics.adt;

public class AppCounter {
public static void main(String[] args) {
	Counter c=new Counter("OridinaryCounter");
	c.increment();
	System.out.println(c.getCurrentValue());
	System.out.println(c.toString());
}
}
