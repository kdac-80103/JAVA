package com.sunbeam;

public class Clerk implements Emp {
	private double salary;
	
	Clerk(){
		salary = 100000;
	}
	Clerk(double salary){
		this.salary = salary;
	}
	
	@Override
	public double getSal() {
		return salary;
	}

}
