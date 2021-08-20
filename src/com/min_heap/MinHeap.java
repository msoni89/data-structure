package com.min_heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

	List<Integer> heap = new ArrayList<Integer>();

	public MinHeap(List<Integer> array) {
		heap = buildHeap(array);
	}

	public List<Integer> buildHeap(List<Integer> array) {
		int parentIndex = (array.size() - 2) / 2;
		for (int i = parentIndex; i >= 0; i--) {
			shiftDown(i, array.size(), array);
		}
		return array;
	}

	public void shiftDown(int currentIdx, int endIdx, List<Integer> heap) {
		int childIndexOne = (currentIdx * 2) + 1;
		while (childIndexOne < endIdx) {
			int childIndexTwo = (currentIdx * 2) + 2 < endIdx ? (currentIdx * 2) + 2 : -1;
			int indexToSwap = childIndexTwo;
			if (childIndexTwo != -1 && heap.get(childIndexTwo) < heap.get(childIndexOne)) {
				indexToSwap = childIndexTwo;
			} else {
				indexToSwap = childIndexOne;
			}
			if (heap.get(indexToSwap) < heap.get(currentIdx)) {
				swap(indexToSwap, currentIdx, heap);
				currentIdx = indexToSwap;
				childIndexOne = (currentIdx * 2) + 1;
			} else {
				break;
			}
		}
	}

	public void shiftUp(int currentIdx, List<Integer> heap) {
		int parentIndex = (currentIdx - 1) / 2;
		while (currentIdx > 0 && heap.get(currentIdx) < heap.get(parentIndex)) {
			swap(parentIndex, currentIdx, heap);
			currentIdx = parentIndex;
			parentIndex = (currentIdx - 1) / 2;
		}
	}

	public int peek() {
		return heap.get(0);
	}

	public int remove() {
		swap(0, heap.size() - 1, heap);
		int itemToReturn = heap.remove(heap.size() - 1);
		shiftDown(0, heap.size(), heap);
		return itemToReturn;
	}

	public void insert(int value) {
		heap.add(value);
		shiftUp(heap.size() - 1, heap);
	}

	public void swap(int firstIndex, int lastIndex, List<Integer> heap) {
		int swap = heap.get(firstIndex);
		heap.set(firstIndex, heap.get(lastIndex));
		heap.set(lastIndex, swap);
	}

	public void print() {
		System.out.println(heap);
	}
}
