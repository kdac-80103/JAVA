package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Random r = new Random();
		
		Stream<Integer> s = Stream.generate(()->r.nextInt(100)).limit(10);
//		s.forEach(ele->System.out.println(ele));
		
		int res = s.reduce(0,(a,e)->a+e);
		System.out.println(res);
	}

}
