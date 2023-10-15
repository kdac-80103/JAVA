import java.util.Scanner;

public class ConversionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConversionMethod cm = new ConversionMethod();

		System.out.println("Enter any integer number you desired = ");
		int num;
		num = sc.nextInt();

		String res1;
		String res2;
		String res3;

		res1 = cm.toBinaryString(num);
		System.out.println("binary = " + res1);

		res2 = cm.toOctalString(num);
		System.out.println("octal = " + res2);

		res3 = cm.toHexString(num);
		System.out.println("hex = " + res3);

	}
}
