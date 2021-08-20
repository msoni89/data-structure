package com.binary_search;

public class BinarySearch {

	public int binarySearch(int[] x, int y) {
		int high = x.length - 1;
		int low = 0;
		return helper(x, y, high, low);
	}

	public int helper(int[] x, int y, int high, int low) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			
			if (x[mid] == y)
				return mid;

			if (x[mid] > y)
				return helper(x, y, mid - 1, low);

			return helper(x, y, high, mid + 1);
		}
		return -1;
	}
}
