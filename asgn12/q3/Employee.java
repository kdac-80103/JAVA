package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double sal;
	Scanner scanner = new Scanner(System.in);
	
	public Employee() {

	}

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	public void accept() {
		System.out.println("Enter id = ");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter name = ");
		name = scanner.nextLine();
		System.out.println("Enter salary = ");
		sal = scanner.nextDouble();
	}

}
