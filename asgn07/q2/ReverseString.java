/*Q2. Write a java program to reverse a String*/
package reversestring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String revStr;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to Reverse: ");
		revStr = sc.next();
		StringBuilder sb = new StringBuilder(revStr);
		sb.reverse();
		System.out.println("The reversed string is: " + sb);
	}

}
