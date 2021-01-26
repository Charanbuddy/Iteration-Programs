package org.task;

import java.util.Scanner;

public class It09 {

	public static void SumOfOdd() {

		// To print the sum of odd and even in 100

		Scanner s = new Scanner(System.in);
		System.out.println("Enter : ");
		int nextInt = s.nextInt();

		int a = 0;
		int b = 0;

		for (int i = 1; i <= nextInt; i++) {
			if (i % 2 == 0) {
				a = a + 1;
			} else {

				b = b + 1;
			}

		}
		System.out.println("Total count of Even Numbers: " + a);
		System.out.println("Total count of odd Numbers: " + b);

	}

}
