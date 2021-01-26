package org.task;

import java.util.Scanner;

public class It26 {

	public static void SwappingUsingTempvariable() {

		int a = 10, b = 20;
		System.out.println("Before Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
