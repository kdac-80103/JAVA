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

public class CreditLimit {
	private int accNumber;
	private int balBeginning;
	private int chargesApplied;
	private int creditPaid;
	private int creditLimit;

	public CreditLimit(int accNumber, int balBeginning, int chargesApplied, int creditPaid, int creditLimit) {

		this.accNumber = accNumber;
		this.balBeginning = balBeginning;
		this.chargesApplied = chargesApplied;
		this.creditPaid = creditPaid;
		this.creditLimit = creditLimit;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public int getBalBeginning() {
		return balBeginning;
	}

	public void setBalBeginning(int balBeginning) {
		this.balBeginning = balBeginning;
	}

	public int getChargesApplied() {
		return chargesApplied;
	}

	public void setChargesApplied(int chargesApplied) {
		this.chargesApplied = chargesApplied;
	}

	public int getCrditPaid() {
		return creditPaid;
	}

	public void setCrditPaid(int crditPaid) {
		this.creditPaid = crditPaid;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	int newBalance() {
		int newBal = this.balBeginning + this.chargesApplied - this.creditPaid;
		return newBal;
	}

}
