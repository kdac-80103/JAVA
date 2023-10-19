package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		Collections.addAll(list, "not_him","someone", "somebody", "he", "him");
		
		CustomComparator comparator = new CustomComparator();
		
		String str = Collections.max(list, comparator);
		System.out.println("MAX String = "+str);
//		list.add("not_him");
//		list.add("someone");
//		list.add("somebody");
//		list.add("he");
//		list.add("him");
		
//		String str = Collections.max(list);
//		System.out.println(str);
		
		
	}

}
