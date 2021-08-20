package com.generic_heap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class GenericHeap {

	private List<Integer> heap = new ArrayList<Integer>();
	private BiFunction<Integer, Integer, Boolean> function;
	private Integer length;
	private String heapName;

	public GenericHeap(String heapName, BiFunction<Integer, Integer, Boolean> function, List<Integer> array, int length) {
		this.function = function;
		this.heap = buildHeap(array, length);
		this.heapName = heapName;
		this.length = length;
	}
	
	public GenericHeap(String heapName, BiFunction<Integer, Integer, Boolean> function, List<Integer> array) {
		this.function = function;
		this.heap = buildHeap(array, array.size());
		this.heapName = heapName;
		this.length = array.size();
	}

	public List<Integer> buildHeap(List<Integer> array, int length) {
		int parentIndex = (length - 2) / 2;
		for (int i = parentIndex; i >= 0; i--) {
			shiftDown(i, length, array);
		}
		return array;
	}

	public void shiftDown(int currentIdx, int endIdx, List<Integer> heap) {
		int childIndexOne = (currentIdx * 2) + 1;
		while (childIndexOne < endIdx) {
			int childIndexTwo = (currentIdx * 2) + 2 < endIdx ? (currentIdx * 2) + 2 : -1;
			int indexToSwap = childIndexTwo;
			if (childIndexTwo != -1) {
				if (function.apply(heap.get(childIndexTwo), heap.get(childIndexOne))) {
					indexToSwap = childIndexTwo;
				} else {
					indexToSwap = childIndexOne;
				}
			} else {
				indexToSwap = childIndexOne;
			}
			if (function.apply(heap.get(indexToSwap), heap.get(currentIdx))) {
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

		while (currentIdx > 0) {
			if (function.apply(heap.get(currentIdx), heap.get(parentIndex))) {
				swap(parentIndex, currentIdx, heap);
				currentIdx = parentIndex;
				parentIndex = (currentIdx - 1) / 2;
			} else {
				return;
			}
		}
	}

	public int peek() {
		if (this.length > 0)
			return heap.get(0);
		return 0;
	}

	public int remove() {
		swap(0, this.length - 1, heap);
		int itemToReturn = heap.remove(this.length - 1);
		length--;
		shiftDown(0, this.length, heap);
		return itemToReturn;
	}

	public void insert(int value) {
		heap.add(value);
		length++;
		shiftUp(this.length - 1, heap);
	}

	public void swap(int firstIndex, int lastIndex, List<Integer> heap) {
		int swap = heap.get(firstIndex);
		heap.set(firstIndex, heap.get(lastIndex));
		heap.set(lastIndex, swap);
	}

	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "GenericHeap [name=" + heapName + ", heap=" + heap + ", function=" + function + ", length=" + length
				+ "]";
	}

	public Integer getLength() {
		return this.length;
	}
}
