package org.task;

import java.util.Arrays;
import java.util.Scanner;

public class It29 {

	public static void SortTheElementsInArrayWithoutPredefinedMethods() {

// Without using predefined methods sort the elements in array in descending order

		int[] a = { 1, 9, 8, 4, 7 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		System.out.println("After Sorting in Descending order: ");
		for (int i : a) {
			System.out.println(i + "\t");
		}
	}

}
