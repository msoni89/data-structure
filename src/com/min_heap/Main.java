package com.min_heap;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[] { 544, -578, 556, 713, -655, -359, -810, -731, 194, -531, -685, 689, -279, -738, 886, -54,
				-320, -500, 738, 445, -401, 993, -753, 329, -396, -924, -975, 376, 748, -356, 972, 459, 399, 669, -488,
				568, -702, 551, 763, -90, -249, -45, 452, -917, 394, 195, -877, 153, 153, 788, 844, 867, 266, -739, 904,
				-154, -947, 464, 343, -312, 150, -656, 528, 61, 94, -581 };

		List<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			array.add(a[i]);
		}
		MinHeap minHeap = new MinHeap(array);
		minHeap.print();

	}
}
