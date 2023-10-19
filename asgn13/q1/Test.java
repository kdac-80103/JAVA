package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Book> book = new HashSet<Book>();
		
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

//public int hashCode()
//
//Returns a hash code for this string. The hash code for a String object is computed as
//
//     s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
     


//without hascode = 
//-------------------------------------------------------------
//Book [isbn=b30, bookName=something, author=am t, price=310.0]
//Book [isbn=b50, bookName=nagas, author=amish tripati, price=280.0]
//Book [isbn=b40, bookName=meluha, author=a, price=250.0]
//Book [isbn=b10, bookName=ram, author=amish, price=200.0]
//Book [isbn=b30, bookName=ravan, author=am t, price=300.0]
//Book [isbn=b20, bookName=sita, author=a t, price=210.0]
//Book [isbn=b20, bookName=something_else, author=a t, price=220.0]

