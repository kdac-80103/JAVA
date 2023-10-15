import java.util.Scanner;

public class DatatypeMethod {

	void checkIfDouble(Scanner sc) {
		double firstNum;
		double secondNum;

		System.out.println("Enter first number = ");
		if (sc.hasNextDouble()) {
			firstNum = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter second number = ");
			
			if (sc.hasNextDouble()) {
				secondNum = sc.nextDouble();
				sc.close();
				double average = (firstNum + secondNum) / 2.0;
				System.out.println("avg = "+average);
			} else {
				System.out.println("second nuber is not a double");
				sc.close();
			}
		} else {
			System.out.println("first number is not a double");
			sc.close();
		}

	}
}
