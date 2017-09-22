package com.manoj.DataStructures.InsertionSort;

public class InsertionSort {
	public int[] insertSort(int[] a) {

		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j > 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		return a;
	}

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] b = is.insertSort(new int[] { 2, 6, 1, 9, 4, });
		for (int i : b) {
			System.out.println(i);
		}

	}
}
