package org.task;

import java.util.Scanner;

public class It12 {

	public static void MultiplicationOfDigits() {

		// Multiplication of Digits in a given Number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();

		int revNumber = 1;
		int remainder = 0;

		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			revNumber = revNumber * remainder;
		}
		System.out.println("Multiplication of the given Number: " + revNumber);

	}


}
