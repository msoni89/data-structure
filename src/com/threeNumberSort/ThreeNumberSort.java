package com.threeNumberSort;

public class ThreeNumberSort {

	public static int[] sort(int[] second, int[] first) {
		int counter = 0;
		for (int i = 0; i < second.length; i++) {
			for (int j = counter; j < first.length; j++) {
				if (second[i] == first[j]) {
					int temp = first[counter];
					first[counter] = first[j];
					first[j] = temp;
					counter++;
				}
			}
		}
		return first;
	}

}
