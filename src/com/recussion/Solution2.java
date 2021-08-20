package com.recussion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {

	public static void main(String[] args) {
		Map<BigInteger, BigInteger> memonize = new HashMap<BigInteger, BigInteger>();
		memonize.put(BigInteger.valueOf(0), BigInteger.valueOf(0));
		memonize.put(BigInteger.valueOf(1), BigInteger.valueOf(1));
		System.out.println(getNthFib(BigInteger.valueOf(100), memonize));
	}

	public static BigInteger getNthFib(BigInteger n, Map<BigInteger, BigInteger> memonize) {
		if (memonize.containsKey(n))
			return memonize.get(n);
		else {
			BigInteger fib = getNthFib(n.subtract( BigInteger.valueOf(1)), memonize).add(getNthFib(n.subtract( BigInteger.valueOf(2)), memonize));
			memonize.put(n, fib);
			return fib;
		}
	}
}
