package org.task;

import java.util.Scanner;

public class It21 {

	public static void main(String[] args) {

		// Reverse a String Character With Word() {

		// Expected output="emoclew ot avaj ssalc "

		String name = "welcome to java class";
		String res = "";

		// String[] str=["welcome","to","java","class"]

		String[] splits = name.split("");
		for (String word : splits) {
			String rev = " ";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}

			res = res + "  " + rev;
		}

		System.out.println(res);

	}

}
