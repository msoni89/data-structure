package com.recussion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();

		list.add(5);
		list.add(2);
		List<Object> x = new ArrayList<Object>();
		x.add(7);
		x.add(-1);
		list.add(x);
		list.add(3);
		List<Object> y = new ArrayList<Object>();
		y.add(6);
		List<Object> z = new ArrayList<Object>();
		z.add(-13);
		z.add(8);
		y.add(z);
		y.add(4);
		list.add(y);

		System.out.println(productSum(list));
	}

	public static int productSum(List<Object> list) {
		return recussive(list, 1);
	}

	public static int recussive(List<Object> list, int level) {
		int sum = 0;
		for (Object object : list) {
			if (object instanceof Integer) {
				sum += (Integer) object;
			} else {
				sum =  sum +  ((level + 1) * recussive((List<Object>) object, level + 1));
			}
		}

		return sum;
	}

}
