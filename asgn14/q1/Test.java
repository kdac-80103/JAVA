package com.sunbeam;

public class Test {

	public static void main(String[] args) {
		Emp[] arr = new Emp[3];

		arr[0] = new Manager(215000, 40000);
		arr[1] = new Clerk(60000);
		arr[2] = new Labor(600, 450.00);
		double total = Emp.calcTotalIncome(arr);
		System.out.println("Total income  = "+total);

	}

}
