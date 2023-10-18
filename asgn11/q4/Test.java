package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List<Book> li = new ArrayList<Book>();
		Book b1;
		int ind;
		int choice;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice = ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: // adding books
				b1 = new Book();
				b1.accept();
				li.add(b1);
				break;

			case 2: // printing books
				for (Book b : li) {
					System.out.println(b);
				}
				break;
			case 3: // delete at particular index
				System.out.println("Enter particular index to delete = ");
				ind = scanner.nextInt();
				li.remove(ind);
				break;
			case 4: // Check if book with given isbn is in list or not
				String isbn = scanner.next();
				Book key = new Book();
				System.out.println("Enter isbn to check = ");
				key.setIsbn(isbn);
				if (li.contains(key)) {
					System.out.println("FOUND");
				} else {
					System.out.println("NOT FOUND");
				}
				break;
			case 5:
				li.clear();
				break;
			case 6:
				System.out.println("SIZE = " + li.size());
				break;
			case 7:
				BookPriceComparator comparator = new BookPriceComparator();
				li.sort(comparator);
				break;
			}
		} while (choice != 0);

	}

}
