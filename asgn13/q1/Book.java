package com.sunbeam;

import java.util.Objects;

public class Book {
	private String isbn;
	private String bookName;
	private String author;
	private double price;

	public Book(String isbn, String bookName, String author, double price) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	public int hashCode() {
		int i = isbn.hashCode();
		return i;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Book) {
			Book other = (Book) obj;
			if (this.isbn == other.isbn)
				return true;
		}
		return false;
	}
}
