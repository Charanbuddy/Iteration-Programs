package org.task;

import java.util.Scanner;

public class It17 {

	public static void ArmstrongNumber(int num) {

		int n = num;
		int rem = 0;
		int res = 0;

		while (num > 0) {
			rem = num % 10;
			res = res + (rem * rem * rem);
			num = num / 10;

			if (n == res) {
				System.out.println(n + " is an Armstrong Number");
			} else {
				System.out.println(n + " is not an Armstrong Number");
			}

		}

	}
}
