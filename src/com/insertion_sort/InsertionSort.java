package com.insertion_sort;

public class InsertionSort {

	public static int[] sort(int[] x) {
		for (int i = 1; i < x.length; i++) {
			int value = x[i];
			int index = i;
			while (index > 0 && x[index - 1] > value) {
				x[index] = x[index - 1];
				index--;
			}
			x[index] = value;
		}
		return x;
	}
}
// Stable: yes
// Worst case O[N^2]
// Best case O[N]
// Space complexity O[1]  because of -> int value = x[i];