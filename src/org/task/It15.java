package org.task;

import java.util.Scanner;

public class It15 {

	public static void ReverseNumberTypeConversion() {

//reverse a number using type conversion (Integer to string conversion) 

		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: " + sc);
		int n = sc.nextInt();

		String res = "";
		// to convert an Interger to String(n);
		// String num=Integer.toString(n);

		String num = String.valueOf(n);
		for (int i = num.length() - 1; i >= 0; i--) {
			char c = num.charAt(i);
			res = res + c;
		}
		System.out.println(res);
		// To convert a string into Integer
		int no = Integer.parseInt(res);
		System.err.println(no);
	}
}
