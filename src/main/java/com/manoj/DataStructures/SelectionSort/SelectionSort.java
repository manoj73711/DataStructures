package com.manoj.DataStructures.SelectionSort;

public class SelectionSort {

	public int[] SelectSort(int[] a) {
		for (int k = 0; k < a.length - 1; k++) {
			int min = k;
			for (int i = k + 1; i < a.length; i++) {
				if (a[i] < a[min]) {
					min = i;
				}
			}
			if (a[k] > a[min]) {
				int temp = a[k];
				a[k] = a[min];
				a[min] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 6, 1, 3 };
		SelectionSort s = new SelectionSort();
		int[] b = s.SelectSort(a);
		for (int i : b) {
			System.out.println(i);
		}

	}
}
