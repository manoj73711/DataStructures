package com.syntel.datastructures.basics.adt;

public class Counter {
private String name;
private int num;
	
	public Counter(String name){
		this.name=name;
	}
	
	public void  increment(){
		num=num+1;
	}
	public int getCurrentValue(){
		return num;
	}

	@Override
	public String toString() {
		return name+":"+num;
	}
	
}
