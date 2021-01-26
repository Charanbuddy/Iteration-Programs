package org.task;

import java.util.Scanner;

public class It06 {

	// Print the even number count from 1 to 300
		public static void EvenNumberCount() {
			int a = 0;
			for (int i = 1; i <= 300; i++) {
				if (i % 2 == 0) {

					a++;
				}

			}
			System.out.println("Total Count of even Numbers:" + a);

		}
}
