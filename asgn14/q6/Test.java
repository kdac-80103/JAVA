package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for factorial = ");
		int num = scanner.nextInt();
		 Stream<Integer> strm = Stream.iterate(1, x -> x+1).limit(num);
		 int res = strm.reduce(1,(a,b)->a*b);
		 System.out.println(res);
	}

}
