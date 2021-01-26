package org.task;

import java.util.Scanner;

public class It20 {

	public static void main(String[] args) {

		// Reverse a String Word

		// Expected output="class java to welcome"

		String name = "welcome to java class";
		String res = "";

		// String[] str=["welcome","to","java","class"]

		String[] splits = name.split("");
		for (int i = splits.length - 1; i >= 0; i--) {
			res = res + " " + splits[i];
		}
		System.out.println(res);

	}
}
