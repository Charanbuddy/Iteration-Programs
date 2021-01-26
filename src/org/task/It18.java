package org.task;

import java.util.Scanner;

public class It18 {

	public static void main(String[] args) {

		// Reverse a String1

		String name = "Java";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			rev = rev + ch;
		}

	}

}
