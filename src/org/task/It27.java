package org.task;

import java.util.Arrays;
import java.util.Scanner;

public class It27 {

	public static void main(String[] args) {
		// Sort The Elements In Array

		int[] a = { 1, 9, 8, 4, 5, 2, 6 };

		Arrays.sort(a);

		// 0 1 2 3 4 5 6
		// Largest Number-------------var[var.length-1]
		// Smallest Number------------var[0]
		// var[var.length-2]---------2nd maximum Number
		// var[1]-------2nd minimum Number

		for (int i : a) {
			System.out.println(i);
		}

	}
}
