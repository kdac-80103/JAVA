package com.sunbeam;

import java.util.Scanner;

public class Test {
	
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n--------------------------\n");
			System.out.println("Enter choice = ");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter first number = ");
				Double num1 = scanner.nextDouble();
				System.out.println("Enter second number = ");
				Double num2 = scanner.nextDouble();
				//addition
				calculate(num1, num2, (a,b)->a+b);
				break;
			case 2:
				System.out.println("Enter first number = ");
				Double num3 = scanner.nextDouble();
				System.out.println("Enter second number = ");
				Double num4 = scanner.nextDouble();
				//subtraction
				calculate(num3, num4, (a,b)->a-b);
				break;
			case 3:
				System.out.println("Enter first number = ");
				Double num5 = scanner.nextDouble();
				System.out.println("Enter second number = ");
				Double num6 = scanner.nextDouble();
				//multiplication
				calculate(num5, num6, (a,b)->a*b);
				break;
			case 4:
				System.out.println("Enter first number = ");
				Double num7 = scanner.nextDouble();
				System.out.println("Enter second number = ");
				Double num8 = scanner.nextDouble();
				//Division
				calculate(num7, num8, (a,b)->a/b);
				break;
			}
			
		}while(choice != 0);
		scanner.close();
	}

}
