package org.task;

import java.util.Scanner;

public class It24 {
	public static void main(String[] args) {

		// Fibbonacci Number

		int n = 5;
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= n; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}
}
