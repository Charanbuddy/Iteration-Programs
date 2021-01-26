package org.task;

import java.util.Scanner;

public class It25 {

	public static void main(String[] args) {

		// Swapping Using Temp variable

		int a = 10, b = 20;
		System.out.println("Before Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		int temp = a;
		a = b;
		b = a;

		System.out.println("After Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
