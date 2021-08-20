package com.selection_sort;

public class SelectionSort {
	public static int[] sort(int[] array) {
//		 64, 25, 12, 22, 11 
		for (int i = 0; i < array.length; i++) {
			int index = i;
			for (int j = i; j < array.length; j++) {
				if (array[index] > array[j]) {
					index = j;
				}
			}

			if (i != index) {
				System.out.println(index);
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}
		return array;
	}
}
