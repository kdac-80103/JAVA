package com.sunbeam;

import java.util.Scanner;

public class Book {
	private String isbn;
	private String bookName;
	private String author;
	private double price;
	
	public Book() {
		
	}
	
	public Book(String isbn, String bookName, String author, double price) {
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
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter isbn = ");
		isbn = scanner.nextLine();
		
		System.out.println("Enter bookName = ");
		bookName = scanner.nextLine();
		
		System.out.println("Enter author = ");
		author = scanner.nextLine();
		
		System.out.println("Enter price = ");
		price = scanner.nextDouble();
	}
}

