package com.sunbeam;

public interface Emp {
	public double getSal();

	public default double calcIncentives() {
		return 0.0;
	}

	public static double calcTotalIncome(Emp arr[]) {
		double income = 0.0;
		for (Emp e : arr) {
			income += e.getSal() + e.calcIncentives();
		}
		return income;
	}
}
