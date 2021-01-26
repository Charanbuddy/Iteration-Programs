package org.task;

import java.util.Scanner;

public class It01 {

	public static void EvenOrOdd() {

		// To find the Even or Odd

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the NUmber:");
		int a = scan.nextInt();

		if (a % 2 == 0) {

			System.out.println(a + " is a even number");
		} else {
			System.out.println(a + " is a Odd Number");
		}
	}
}
