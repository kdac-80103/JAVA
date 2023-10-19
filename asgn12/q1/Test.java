package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book b;
		int index;
		int bookCount = 0;
		int choice;
		String isbn1;

		List<Book> list = new ArrayList<Book>();

		do {
			System.out.println("Enter choice = ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				b = new Book();
				b.acceptBook();

				if (list.contains(b)) {
					index = list.indexOf(b);
					Book bk = list.get(index);
					bk.setQuantity(bk.getQuantity()+1);
					System.out.println("count = " + bk.getQuantity());
				} else {
					list.add(b);
				}
				break;
			case 2:
				// forward traverse
				// for(int i=0; i<list.size; i++){
//					b = list.get(i);
//					syso(b);
//				}
				
				ListIterator<Book> itr = list.listIterator();
				while (itr.hasNext()) {
					Book book = itr.next();
					System.out.println(book);
				}

				
				break;
			case 3: // Search a book with given isbn (hint - indexOf())
				System.out.println("Enter index to search  book = ");
				index = scanner.nextInt();
				b = list.get(index);
				System.out.println(b);
				break;
			case 4:
				System.out.println("Enter particular index to delete = ");
				index = scanner.nextInt();
				list.remove(index);
				break;
			case 5:
				System.out.println("Enter isbn to delete particular record = ");
				isbn1=scanner.next();
	    		Book key=new Book();
	    		key.setIsbn(isbn1);
	    		if(list.contains(key)) {
	    			int something = list.indexOf(key);
	    			list.remove(something);
	    		}
				break;
			case 6:
				Collections.reverse(list);
//				System.out.println(list);
				for(Book l:list)
					System.out.println(l);
				break;
			}
		} while (choice != 0);

	}

}
