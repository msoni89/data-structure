package com.max_heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

	List<Integer> heap = new ArrayList<Integer>();

	public MaxHeap(List<Integer> array) {
		heap = buildHeap(array);
	}

	public List<Integer> buildHeap(List<Integer> array) {
		int parentIndex = (array.size() - 2) / 2;
		for (int i = parentIndex; i >= 0; i--) {
			shiftDown(i, array.size(), array);
		}
		return array;
	}

	public void shiftDown(int currentIndex, int endIndex, List<Integer> heap) {
		int childIndexOne = (currentIndex * 2) + 1;
		while (childIndexOne < endIndex) {
			int childIndexTwo = (currentIndex * 2) + 2 < endIndex ? (currentIndex * 2) + 2 : -1;
			int indexToSwap = childIndexTwo;
			if (childIndexTwo != -1 && heap.get(childIndexTwo) > heap.get(childIndexOne)) {
				indexToSwap = childIndexTwo;
			} else {
				indexToSwap = childIndexOne;
			}
			if (heap.get(indexToSwap) > heap.get(currentIndex)) {
				swap(currentIndex, indexToSwap, heap);
				currentIndex = indexToSwap;
				childIndexOne = (currentIndex * 2) + 1;
			} else {
				break;
			}
		}

	}

	public void shiftUp(int currentIndex, List<Integer> heap) {
		int parentIndex = (currentIndex - 1) / 2;
		while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parentIndex)) {
			swap(parentIndex, currentIndex, heap);
			currentIndex = parentIndex;
			parentIndex = (currentIndex - 1) / 2;
		}

	}

	public void insert(int value) {
		heap.add(value);
		shiftUp(heap.size() - 1, heap);
	}

	public int remove() {
		swap(0, heap.size() - 1, heap);
		int itemToRemove = heap.remove(heap.size() - 1);
		shiftDown(0, heap.size(), heap);
		return itemToRemove;
	}

	public void swap(int index, int lastIndex, List<Integer> heap) {
		int element = heap.get(index);
		heap.set(index, heap.get(lastIndex));
		heap.set(lastIndex, element);
	}

	public void print() {
		System.out.println(heap);
	}
}
