package com.sunbeam.credit;

//Q1. (Credit Limit Calculator)
//Develop a Java application that determines whether any of several department-store customers has
//exceeded the credit limit on a charge account.
//For each customer,the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning
//balance+ charges – credits), display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded".

public class CreditLimitTest {

	public static void main(String[] args) {

		CreditLimit cl1 = new CreditLimit(101, 1000, 800, 400, 1800);

		int newBalance = cl1.newBalance();

		if (newBalance <= cl1.getCreditLimit()) {
			System.out.println("new balance = " + newBalance);
		} else {
			System.out.println("Credit limit exceeded...");
		}

	}

}
