package com.sunbeam;

import java.util.function.Predicate;

public class StramLengthMain {
	
	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
		}
	
	public static void main(String[] args) {
		
		String []arr = {"rrrrrrrrr", "cdcdcdcdcd", "as", "er", "sdfsdfsd"};
		
		System.out.println(countIf(arr, s -> s.length()>6));

	}

}
