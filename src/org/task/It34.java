package org.task;

import java.util.Arrays;
import java.util.Scanner;

public class It34 {

	public static void main(String[] args) {
		// To check Vowels and Consonants in a String
		/*
		 * ASCII Code
		 * 
		 * A-Z ---> 65-90 a-z ---> 97-122 0-9 ---> 48-57
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");

		String n = sc.next();

		String name = n;

		String vowels = "", cons = "";
		int vowelsCount = 0, consCount = 0;

		char[] ch = name.toCharArray();
		for (char c : ch) {
			if (c >= 65 && c <= 122) {
				vowels = vowels + c;
				vowelsCount++;
			} else {
				consCount++;
				cons = cons + c;
			}
		}

		System.out.println("Vowels: " + vowels + " Count:  " + vowelsCount);
		System.out.println("Consonants: " + cons + " Count:  " + consCount);

	}
}