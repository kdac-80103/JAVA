package com.sunbeam;

import java.util.Scanner;

public class Student {
	private String name;
	private int rollNo;
	private double marks;

	public Student() {

	}

	public Student(String name, int rollNo, double marks) {

		this.name = name;
		this.rollNo = rollNo;
		marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		marks = marks;
	}
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name = ");
		name = scanner.nextLine();
		System.out.println("Enter roll number = ");
		rollNo = scanner.nextInt();
		System.out.println("Enter marks = ");
		marks = scanner.nextDouble();	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", Marks=" + marks + "]";
	}

}
