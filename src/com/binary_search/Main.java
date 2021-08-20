package com.binary_search;

public class Main {

	public static void main(String[] args) {

		BinarySearch binarySearch = new BinarySearch();
		int indexOf = binarySearch.binarySearch(
				new int[] { 1, 2, 2, 3, 5, 5, 6, 6, 7, 7, 8, 10, 12, 12, 12, 23, 35, 45, 89, 100, 121, 234 }, 3);
		System.out.println(indexOf);
	}
}
