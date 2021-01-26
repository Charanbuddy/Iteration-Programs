package org.task;

import java.util.Scanner;

public class It22 {

	public static void main(String[] args) {

		// First Letter Of The Word Will Be Capital

		// Expected output="Welcome To Java Class"

		String name = "welcome to java class";
		String res = " ";
		String output = "";
		// String[] str=["welcome","to","java","class"]

		String[] splits = name.split("");
		for (String word : splits) {
			char c = word.charAt(0);

			res = Character.toUpperCase(c) + word.substring(1);

			output = output + " " + res;
		}

		System.out.println(output);

	}
}
