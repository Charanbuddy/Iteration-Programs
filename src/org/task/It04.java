package org.task;

import java.util.Scanner;

public class It04 {

	public static void main(String[] args) {

		// Print the odd number count from 1 to 100

		int a = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {

				a++;
			}

		}

		System.out.println("Total count of Odd Numbers: " + a);

	}

}
