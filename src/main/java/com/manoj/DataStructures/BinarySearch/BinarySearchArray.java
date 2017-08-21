package com.manoj.DataStructures.BinarySearch;

public class BinarySearchArray {
	int[] a;
	int noElem;

	public BinarySearchArray(int ele) {
		a = new int[ele];
	}

	public int get(int x) {
		int lowerBound = 0;
		int upperBound = noElem - 1;
		while (true) {
			int curr = (lowerBound + upperBound) / 2;
			if (a[curr] == x)
				return curr;
			else if (lowerBound > upperBound)
				return noElem;// cant find it
			else {
				if (a[curr] < x) {
					lowerBound = curr + 1;
				} else
					upperBound = curr - 1;
			}
		}

	}

	public boolean delete(int x) {
		int val = get(x);
		if (val == noElem)
			return false;
		else
			for (int i = val; i < noElem; i++) {
				a[i] = a[i + 1];
			}
		noElem--;
		return true;
	}

	public boolean add(int x) {
		int j;
		for (j = 0; j < noElem; j++) {
			if (a[j] > x)
				break;
		}
		for (int k = noElem; k > j; k--) {
			a[k] = a[k - 1];
		}
		a[j] = x;
		noElem++;
		return true;
	}

	public void display() {
		for (int i = 0; i < noElem; i++) {
			System.out.println(a[i]);
		}
	}

}
