package com.threeNumberSort;

import java.util.Arrays;

import com.selection_sort.SelectionSort;

public class Main {
	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(ThreeNumberSort.sort(new int[] { -1, 0, 1 }, new int[] { 1, 0, 0, -1, -1, 0, 1, 1 })));

	}
}
