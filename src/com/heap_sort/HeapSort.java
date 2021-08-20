package com.heap_sort;

public class HeapSort {

	public static int[] sort(int[] array) {
		HeapSort heapSort = new HeapSort();
		return heapSort.buildHeap(array);
	}

	public int[] buildHeap(int[] array) {
		int parentIndex = (array.length - 1) / 2;
		for (int i = parentIndex; i >= 0; i--) {
			shiftDown(i, array.length, array);
		}

		for (int i = array.length - 1; i >= 0; i--) {
			swap(0, i , array);
			shiftDown(0, i, array);
		}
		return array;
	}

	public void shiftDown(int currentIdx, int endIdx, int[] heap) {
		int childIndexOne = (currentIdx * 2) + 1;
		while (childIndexOne < endIdx) {
			int childIndexTwo = (currentIdx * 2) + 2 < endIdx ? (currentIdx * 2) + 2 : -1;
			int indexToSwap = childIndexTwo;
			if (childIndexTwo != -1 && heap[childIndexTwo] < heap[childIndexOne]) {
				indexToSwap = childIndexTwo;
			} else {
				indexToSwap = childIndexOne;
			}
			if (heap[indexToSwap] < heap[currentIdx]) {

				swap(indexToSwap, currentIdx, heap);
				currentIdx = indexToSwap;
				childIndexOne = (currentIdx * 2) + 1;
			} else {
				break;
			}
		}
	}

	public void swap(int firstIndex, int lastIndex, int[] heap) {

		int swap = heap[firstIndex];
		heap[firstIndex] = heap[lastIndex];
		heap[lastIndex] = swap;
	}
}
