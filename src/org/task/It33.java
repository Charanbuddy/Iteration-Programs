package org.task;

import java.util.Arrays;
import java.util.Scanner;

public class It33 {

	public static void main(String[] args) {
		// Separate count uppercase,Lowercase,Digits & Special Character in string
		/*
		 * ASCII Code
		 * 
		 * A-Z ---> 65-90 a-z ---> 97-122 0-9 ---> 48-57
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");

		String n = sc.next();

		String num = n;

		String upper = "", lower = "", digits = "", Special = "";
		int upperCount = 0, lowerCount = 0, digitCount = 0, specialCount = 0;

		char[] ch = n.toCharArray();
		for (char c : ch) {
			if (c >= 65 && c <= 90) {
				upperCount++;
				upper = upper + c;
			} else if (c >= 97 && c <= 122) {
				lowerCount++;
				lower = lower + c;
			} else if (c >= 48 && c <= 57) {
				digitCount++;
				digits = digits + c;
			} else {
				specialCount++;
				Special = Special + c;
			}
		}

		System.out.println("UpperCase: " + upper + " Count:  " + upperCount);
		System.out.println("LowerCase: " + lower + " Count:  " + lowerCount);
		System.out.println("Digits: " + digits + " Count:  " + digitCount);
		System.out.println("Special Character: " + Special + " Count:  " + specialCount);

	}
}