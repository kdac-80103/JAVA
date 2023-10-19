package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Book> book = new TreeSet<Book>();
		
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
	}
}
