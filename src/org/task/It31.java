package org.task;

import java.util.Arrays;
import java.util.Scanner;

public class It31 {

	public static void main(String[] args) {
		// Sorting of Array in String (Ascending Order)
		/*
		 * ASCII Code
		 * 
		 * A-Z ---> 65-90 a-z ---> 97-122 0-9 ---> 48-57
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");

		String n = sc.next();

		String num = n;

		char[] ch = num.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}

			}
		}
		for (char c : ch) {
			System.out.print(c);
		}
	}
}