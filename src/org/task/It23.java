package org.task;

import java.util.Scanner;

public class It23 {

	public static void FactrorialOfaNumber() {

		// Factorial of a Number

		// 5!=5*4*3*2*1

		int res = 1;
		int number = 5;

		for (int i = 1; i <= number; i++) {
			res = res * i;

		}
		System.out.println("factorial of a number: " + res);
	}
}
