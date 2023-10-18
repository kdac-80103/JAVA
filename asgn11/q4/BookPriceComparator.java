package com.sunbeam;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int difference = Double.compare(b1.getPrice(), b2.getPrice());
		return difference;
	}
}
