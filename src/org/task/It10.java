package org.task;

import java.util.Scanner;

public class It10 {
	private void ReverseTheNumber() {
		// Reverse the Number (n=123)

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int number = sc.nextInt();
		int remainder = 0;
		int revNumber = 0;

		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			revNumber = (revNumber * 10) + remainder;
		}
		System.out.println("Reverse number is:" + revNumber);
	}

}
