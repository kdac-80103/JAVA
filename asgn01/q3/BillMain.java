import java.util.Scanner;

public class BillMain {

	static boolean ordering = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int itemCount;

		int menuOption;
		int foodItem = 0;
		double runningTotal = 0;
		do {
			BillMethod.menu();
			menuOption = sc.nextInt();
			switch (menuOption) {
			case 1:
				foodItem = 1;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 2:
				foodItem = 2;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 3:
				foodItem = 3;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 4:
				foodItem = 4;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 5:
				foodItem = 5;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 6:
				foodItem = 6;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 7:
				foodItem = 7;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 8:
				foodItem = 8;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 9:
				foodItem = 9;
				itemCount = BillMethod.quantity();
				runningTotal = runningTotal + (itemCount * BillMethod.itemPrice(foodItem));
				break;
			case 10:
				ordering = false;
				System.out.println(runningTotal);
				System.out.println("Enjoy your meal...!!");
				break;
			default:
				System.out.println("Invalid option.");
			}
		} while (ordering);
		System.out.println("Total amount : " + runningTotal);

	}

}
