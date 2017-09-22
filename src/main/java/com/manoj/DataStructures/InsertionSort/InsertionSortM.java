package com.manoj.DataStructures.InsertionSort;

public class InsertionSortM {
	public int[] insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int comp = a[i];
			int j = i;
			while (j > 0 && comp < a[j - 1]) {
				j--;
			}
			if (a[i] < a[j]) {
				a[i] = a[j];
				a[j] = comp;
				i--;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		InsertionSortM s = new InsertionSortM();
		int[] a = s.insertSort(new int[] { 2, 5, 6, 1, 3 });
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
