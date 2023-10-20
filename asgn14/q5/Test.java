package com.sunbeam;

import java.util.Scanner;

public class Test {
	
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count=0;
		for (T a : arr) {
			if(c.compare(a, key))
				count++;
		}

		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double[] arr = {68.68, 56.30, 45.45, 33.33, 20.20, 33.33, 90.90, 68.68, 38.38};
		
		System.out.println("Enter key = ");
		double key=scanner.nextDouble();
		
		System.out.println("----------------------------------------");
				int count = countIf(arr, key, (x,y)->x.equals(y));
				System.out.println(count);
	}

}
