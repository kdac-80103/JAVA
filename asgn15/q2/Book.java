package com.serializable;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Serializable {

	String isbn;
	double price;
	String author;
	int quantity;
	
	transient Scanner scanner = new Scanner(System.in);
	
	public Book() {

	}

	public Book(String isbn, double price, String author, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.author = author;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", author=" + author + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	public void acceptBook() {
		System.out.println("Enter isbn = ");
		isbn = scanner.nextLine();
		System.out.println("Enter price = ");
		price = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter author = ");
		author = scanner.nextLine();
		System.out.println("Enter quantity = ");
		quantity = scanner.nextInt();
	}

}