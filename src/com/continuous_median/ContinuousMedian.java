package com.continuous_median;

import java.util.ArrayList;

import com.generic_heap.GenericHeap;

public class ContinuousMedian {

	GenericHeap lowerHeap = new GenericHeap("Min", (a, b) -> a > b, new ArrayList<Integer>());
	GenericHeap higherHeap = new GenericHeap("Max", (a, b) -> a <b, new ArrayList<Integer>());

	static double median = 0;

	public static void main(String[] args) {

		ContinuousMedian continuousMedian = new ContinuousMedian();
		continuousMedian.insert(5);
		continuousMedian.insert(10);
		continuousMedian.insert(100);
		continuousMedian.insert(200);
		continuousMedian.insert(6);
		continuousMedian.insert(13);
	
		continuousMedian.lowerHeap.print();
		continuousMedian.higherHeap.print();
		System.out.println(continuousMedian.getMedian());
	}



	public void balanceHeaps() {
		if (lowerHeap.getLength() - higherHeap.getLength() == 2) {
			higherHeap.insert(lowerHeap.remove());
		} else if (higherHeap.getLength() - lowerHeap.getLength() == 2) {
			lowerHeap.insert(higherHeap.remove());
		}
	}

	public double getMedian() {

        if (lowerHeap.getLength() == higherHeap.getLength()) {
			
			median = (((double) lowerHeap.peek() + (double) higherHeap.peek()) / 2.0);
		} else if (lowerHeap.getLength() > higherHeap.getLength()) {
			median = lowerHeap.peek();
		} else {
			median = higherHeap.peek();
		}
		return median;
	}

	public void insert(int value) {
		if (lowerHeap.getLength() == 0 || value < lowerHeap.peek()) {
			lowerHeap.insert(value);
		} else {
			higherHeap.insert(value);

		}

		balanceHeaps();
	}
}
