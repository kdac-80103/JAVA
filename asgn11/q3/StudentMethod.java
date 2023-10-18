package com.sunbeam;

public class StudentMethod {
	private int roll;
	private String name;
	private String city;
	private double marks;
	
//	public StudentMethod() {
//	
//	}
	
	public StudentMethod(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentMethod [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
}
