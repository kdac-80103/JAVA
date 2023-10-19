package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
//		Collection<String> c = new ArrayList<>();	//[[B, D, A, C, null, null, null]]
		//maintains insertion order - duplicates are allowed
		
//		Collection<String> c = new HashSet<>();	
		//[null, A, B, C, D] - maintains alphabetical order with null value in front 
		//and no duplicates
		
//		Collection<String> c = new LinkedHashSet<>(); 
		//[B, D, A, C, null] - maintains insertion order and does not take duplicate nulls too
		
		Collection<String> c = new TreeSet<>();	
		//maintains alphabetical order - no duplicates are allowed
		//Exception in thread "main" java.lang.NullPointerException
		
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("A");
		c.add("C");
		c.add("C");
//		c.add(null);
//		c.add(null);
//		c.add(null);
		
		System.out.println(c.toString());
		

	}

}
