package com.sunbeam;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		CustomComparator comparator = new CustomComparator();
	TreeSet<Book> book = new TreeSet<Book>(comparator);
				
		book.add(new Book("b10", "ram", "amish", 200.00));
		book.add(new Book("b20", "sita", "a t", 210.00));
		book.add(new Book("b20", "something_else", "a t", 220.00));
		book.add(new Book("b30", "ravan", "am t", 300.00));
		book.add(new Book("b30", "something", "am t", 310.00));
		book.add(new Book("b40", "meluha", "a", 250.00));
		book.add(new Book("b50", "nagas", "amish tripati", 280.00));
	
		
		Iterator<Book> itr = book.iterator();
				while(itr.hasNext()) {
						System.out.println(itr.next());
		}
				System.out.println("------------------");
		//descending iterator
					
		Iterator<Book> itr1 = book.descendingIterator();
				while(itr1.hasNext()) {
						Book e = itr1.next();
						System.out.print(e + "\n");
					}
			//we can't use comparable and comparator together.
			// when we use comparator duplicates gets printed too
	}
}
