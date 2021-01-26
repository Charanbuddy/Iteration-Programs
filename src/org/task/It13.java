package org.task;

import java.util.Scanner;

public class It13 {

	public static void CountOfDigits() {

		// Count of digits in a number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int number = sc.nextInt();
		int count = 0;
		while (number > 0) {
			count++;
			number = number / 10;
		}
		System.out.println("Number of Digits present: " + count);
	}

}
