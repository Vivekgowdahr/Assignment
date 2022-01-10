package com.te.sorting;

import java.util.Iterator;

public class EvenOdd {
	public static void main(String[] args) {
		int[] a = { 1, 8, 6, 96, 52, 3, 6, 9, 93, 34, 62, 65 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i] + ": is even");
			//else
				//System.out.println(a[i] + ":a is odd");

		}
	}
}