package org.task;

import java.util.Arrays;
import java.util.Scanner;

public class It28 {

	public static void main(String[] args) {

		// public static void SortTheElementsInArrayWithoutPredefinedMethods() {

// Without using predefined methods sort the elements in array in ascending order

		Scanner sc = new Scanner(System.in);
		System.out.println("type an array Element:");

		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int[] a = { n, n1, n2, n3, n4, n5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		System.out.println("After Sorting in ascending order: ");
		for (int i : a) {
			System.out.print(i + "\t");
		}
	}

}
