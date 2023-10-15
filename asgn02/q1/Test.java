package com.sunbeam.invoice;

public class Test {

	public static void main(String[] args) {
		Invoice i1=new Invoice();
		i1.accept();
		i1.display();
		i1.calInvoice();
		
		i1.sc.close();
	}
}
