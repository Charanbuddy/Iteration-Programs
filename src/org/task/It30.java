package org.task;

import java.util.Arrays;
import java.util.Scanner;

public class It30 {

	public static void main(String[] args) {
		// To check the number is a prime number or not
		// 0 or 1 -->not a prime number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");

		int n = sc.nextInt();

		int num = n;

		boolean res = true;

		if (num == 0 || num == 1) {

			System.out.println("0 & 1 not considered as prime");

		} else {

			for (int i = 2; i < num / 2; i++) {

				if (num % i == 0) {
					res = false;
					break;
				}
			}

			if (res == true) {
				System.out.println("It is a Prime Number");
			} else {
				System.out.println("Not a prime Number");
			}
		}

	}
}
