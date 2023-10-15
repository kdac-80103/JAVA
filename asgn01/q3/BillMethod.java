import java.util.Scanner;

public class BillMethod {
	static double itemPrice;

	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println(
				"1. Dosa \n2. Samosa \n3. Idli \n4. Pohe \n5. Upma \n6. Shira \n7. Misal Pav \n8. VadaPav \n9. Uthappa \n10.Calculate Total Bill");
		System.out.println("Please Enter your item number : ");
	}

	public static double itemPrice(int itemChoice) {
		if (itemChoice == 1) {
			System.out.println("You have ordered Dosa...");
			itemPrice = 40.0;
		} else if (itemChoice == 2) {
			System.out.println("You have ordered Samosa...");
			itemPrice = 15.0;
		} else if (itemChoice == 3) {
			System.out.println("You have ordered Idli...");
			itemPrice = 30.0;
		} else if (itemChoice == 4) {
			System.out.println("You have ordered Pohe...");
			itemPrice = 25.0;
		} else if (itemChoice == 5) {
			System.out.println("You have ordered Upma...");
			itemPrice = 30.0;
		} else if (itemChoice == 6) {
			System.out.println("You have ordered Shira...");
			itemPrice = 60.0;
		} else if (itemChoice == 7) {
			System.out.println("You have ordered Misal Pav...");
			itemPrice = 65.0;
		} else if (itemChoice == 8) {
			System.out.println("You have ordered VadaPav...");
			itemPrice = 20.0;
		} else if (itemChoice == 9) {
			System.out.println("You have ordered Uthppa...");
			itemPrice = 50.0;
		}
		return itemPrice;

	}

	public static int quantity() {
		System.out.println("Enter quantity");
		int quantity = sc.nextInt();
		return quantity;
	}
}
