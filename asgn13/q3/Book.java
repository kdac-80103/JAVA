package com.sunbeam;

public class Book implements Comparable<Book>{
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
	
	@Override
	public int compareTo(Book other) {
		int diff = this.isbn.compareTo(other.isbn);
		return diff;
	}
}
