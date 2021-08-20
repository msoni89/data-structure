package com.recussion;

import java.util.HashMap;
import java.util.Map;

public class Fibonaci {
	public static void main(String[] args) {
		System.out.println(getNthFib(1));
	}

	static Map<Integer, Integer> memonize = new HashMap<Integer, Integer>();

	public static int getNthFib(int n) {
		// Write your code here.
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		if (memonize.containsKey(n))
			return memonize.get(n);
		else {
			int fib = getNthFib(n - 1) + getNthFib(n - 2);
			memonize.put(n, fib);
			return fib;
		}
	}
}
