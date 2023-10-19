package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> empList = new ArrayList<>();
		Employee emp;
		Employee emp1 = new Employee(100, "sam", 1000.00);
		Employee emp2 = new Employee(200, "mas", 2000.00);
		Employee emp3 = new Employee(300, "zxc", 2000.00);
		Employee emp4 = new Employee(250, "ghj", 500.00);
		Employee emp5 = new Employee(700, "mas", 6000.00);

		Collections.addAll(empList, emp1, emp2, emp3, emp4, emp5);

//		Collections.addAll(empList, (100, "sam", 1000.00), (200, "mas", 2000.00));
		int choice;
		int index1;

		do {
			System.out.println("Enter choice = ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:// add
				emp = new Employee();
				emp.accept();
				empList.add(emp);
				break;
			case 2:// show
				for (Employee e : empList)
					System.out.println(e);
				break;
			case 3:// delete
				System.out.println("Enter index to delete particular employee record = ");
				index1 = scanner.nextInt();
				empList.remove(index1);
				System.out.println("Deletion successful, PRESS 2 TO VIEW THE RECORDS...");
				break;
			case 4:// find
				System.out.println("Enter employee id to check = ");
				int id1 = scanner.nextInt();
				Employee empId = new Employee();
				empId.setId(id1);
				if (empList.contains(empId)) {
					System.out.println("FOUND = " + "[" + empId.getId() + "]");
				} else {
					System.out.println("NOT FOUND = ");
				}
				break;
			case 5:// sort
//				Collections.sort;
				break;
			case 6:// edit 
				System.out.println("Enter emp id to be modified: ");
				int id = scanner.nextInt();

				Employee key = new Employee();
				key.setId(id);
				int index = empList.indexOf(key);

				if (index == -1)
					System.out.println("Employee not found.");
				else {
					Employee oldEmp = empList.get(index);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");

					Employee newEmp = new Employee();
					newEmp.accept();
					empList.set(index, newEmp);
				}
				break;
			}
		} while (choice != 0);
	}

}
