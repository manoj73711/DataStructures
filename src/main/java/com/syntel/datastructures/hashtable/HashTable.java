package com.syntel.datastructures.hashtable;

public class HashTable {

	String[] hashArray;
	int arraySize;
	int size = 0; // counter for no of elements in an array

	public HashTable(int slots) {

		if (isPrime(slots)) {
			arraySize = slots;
		} else {
			arraySize = getNextPrime(slots);
			hashArray = new String[arraySize];
		}

	}

	private int getNextPrime(int minNumber) {

		for (int i = minNumber; true; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
	}

	private boolean isPrime(int num) {

		for (int i = 2; i * i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// retruns the preferred index position
	private int hashFunc1(String word) {
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		if (hashVal < 0) {
			hashVal = hashVal + arraySize;
		}
		return hashVal; // ideal index position would like to insert or search in

	}

	// return step size greater than zero
	private int hashFunc2(String word) {
		int hashValue = word.hashCode();
		hashValue = hashValue % arraySize;
		if (hashValue < 0) {
			hashValue += arraySize;
		}

		return 3 - hashValue % 3;
	}

	public void insert(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);

		while (hashArray[hashVal] != null) {
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}

		hashArray[hashVal] = word;
		System.out.println("inserted word: "+word);
		size++;
	}
	
	public String find(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);
		
		while (hashArray[hashVal] != null) {
			if(hashArray[hashVal].equals(word)) {
				return hashArray[hashVal];
			}
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}	
		
		return null;
		
	}

}
