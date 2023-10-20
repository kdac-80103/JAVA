package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Map<String, Book> book = new HashMap<String, Book>();
		Scanner scanner = new Scanner(System.in);
		Book b;
		Book val;
		int choice;
		do {
			System.out.println("\n1.Insert\n2.Serch in map\n3.show entries\n-------------------\n");
			System.out.println("Enter Choice = ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				b = new Book();
				b.accept();
				book.put(b.getIsbn(), b);
				break;
			case 2:
				System.out.println("Enter isbn to search in map = ");
				scanner.nextLine();
				String isbn = scanner.next();
				val = book.get(isbn);
				if (val != null) {
					System.out.println("FOUND");
				} else {
					System.out.println("NOT FOUND");
				}
				break;
			case 3:	//to check the entries
				Set<Entry<String, Book>> entries = book.entrySet();
				for (Entry e : entries) {
					System.out.println(e.getKey() + " --> " + e.getValue());
				}
			}
		} while (choice != 0);

	}

}
