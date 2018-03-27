package com.syntel.datastructures.basics.adt;
/*This class is for the ADT
 * Create a abstract data type called counter which 
 * is initialized to the value zero 
 * and has increment , to string and get current value 
 * methods for the client
 * */
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
