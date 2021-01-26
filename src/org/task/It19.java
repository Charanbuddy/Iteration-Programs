package org.task;

import java.util.Scanner;

public class It19 {

	public static void ReverseAString2() {

		String name = "Java";
		String rev = "";

		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println("Reverse of String: " + rev);
	}

}
