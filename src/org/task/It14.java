package org.task;

import java.util.Scanner;

public class It14 {

	public static void CheckTheNumberIsPalindrome() {

		// To check the Number is Palindrome

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Palindrome Number: ");
		int number = sc.nextInt();

		int n = number;
		int remainder = 0;
		int revnumber = 0;

		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			revnumber = (revnumber * 10) + remainder;
		}
		if (n == revnumber) {

			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}
}
