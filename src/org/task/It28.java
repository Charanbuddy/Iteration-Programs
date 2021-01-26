package org.task;

import java.util.Arrays;
import java.util.Scanner;

public class It28 {
	
public static void main(String[] args) {
	

	//public static void SortTheElementsInArrayWithoutPredefinedMethods() {

// Without using predefined methods sort the elements in array in ascending order

		int[] a = { 1, 9, 8, 4, 7 };

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
