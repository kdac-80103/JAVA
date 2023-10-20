package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<Integer, Student> stud = new LinkedHashMap<Integer, Student>();
		Scanner scanner = new Scanner(System.in);
		
		Student s1;
		Student s2;
		Integer val;
		int choice;
		System.out.println("\n1.Insert\n2.Find using roll number\n3.show entries");
		do {
			System.out.println("Enter choice = ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				s1 = new Student();
				s1.accept();
				stud.put(s1.getRollNo(), s1);
				break;
				
			case 2:
				System.out.println("Enter roll number = ");
				val = scanner.nextInt();
				s2 = stud.get(val);
				if(s2 == null) {
					System.out.println("NOT FOUND");
				}else {
					System.out.println("FOUND");
				}
				break;
				
			case 3:
				Set<Entry<Integer, Student>>entries = stud.entrySet();
				for(Entry e:entries)
					System.out.println(e);
				break;
//			case 4:
//				Set<Integer> keys = stud.keySet();
//				for(Integer k:keys)
//					System.out.println(k+"-->"+stud.get(k));
			}
				
		}while(choice != 0 );
	}

}
