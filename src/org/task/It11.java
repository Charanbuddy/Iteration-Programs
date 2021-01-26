package org.task;

import java.util.Scanner;

public class It11 {

	public static void SumOfSigits() {
		// sum of Digits in a Number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");

		int number = sc.nextInt();

		int revNumber = 0;
		int remainder = 0;

		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			revNumber = revNumber + remainder;

		}
		System.out.println("Sum of the given number: " + revNumber);

	}

}
