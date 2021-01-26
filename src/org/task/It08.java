package org.task;

import java.util.Scanner;

public class It08 {

	public static void OddSum() {

		// Print the odd sum 1 to 80

		int a = 0;
		for (int i = 1; i <= 80; i++) {

			if (i % 2 != 0) {

				a = a + i;
			}
		}
		System.out.println("Sum of Odd Numbers: " + a);

	}

}
