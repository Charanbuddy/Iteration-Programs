package org.task;

import java.util.Scanner;

public class It07 {
	
	public static void EvenSum() {

		// Print the even sum 1 to 90

		int a = 0;
		for (int i = 1; i <= 90; i++) {

			if (i % 2 == 0) {
				a = a + i;

			}

		}

		System.out.println("Sum of Even Numbers: " + a);
	}

}
