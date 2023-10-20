package com.sunbeam;

public class Manager implements Emp {
	private double basicSalary;
	private double dearanceAllowance;

	public Manager() {
		basicSalary = 100000;
		dearanceAllowance = 50000;
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		return basicSalary + dearanceAllowance;
	}

	@Override
	public double calcIncentives() {
		return 0.2 * (basicSalary);
	}

}
