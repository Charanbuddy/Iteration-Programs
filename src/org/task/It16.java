package org.task;

import java.util.Scanner;

public class It16 {

	public static void main(String[] args) {

		// To reverse a string using type conversion(String to Integer Conversion)

		Scanner sc = new Scanner(System.in);
		System.out.println("Type a string:" + sc);

		String n = sc.next();
		String name = String.valueOf(n);
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char c = name.charAt(i);
			reverse = reverse + c;
		}
		System.out.println(reverse);

	}
}
