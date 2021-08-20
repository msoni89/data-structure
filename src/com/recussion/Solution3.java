package com.recussion;

import java.math.BigInteger;

public class Solution3 {

	
	static BigInteger[] memonize = new BigInteger[]{ BigInteger.valueOf(0), BigInteger.valueOf(1) };
	public static void main(String[] args) {
		System.out.println(getNthFib(99));
	}

	public static BigInteger getNthFib(int n) {
		int counter = 2;
		while (counter <= n) {
			BigInteger nextfib = memonize[0].add(memonize[1]);
			memonize[0] = memonize[1];
			memonize[1] = nextfib;
			counter++;
		}
		// Write your code here.
		return n > 1 ? memonize[1] : memonize[0];
	}
}
