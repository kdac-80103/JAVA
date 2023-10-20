package com.sunbeam;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		IntStream is = IntStream.range(1, 11); //1 is included and 11 is excluded
		System.out.println(is.sum());
		
		IntStream is1 = IntStream.range(1, 11);
		System.out.println(is1.summaryStatistics());
	}

}
