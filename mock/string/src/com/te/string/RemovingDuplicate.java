package com.te.string;

import java.util.Scanner;

public class RemovingDuplicate {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the string");
		String b = a.nextLine();
		char[] c = b.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i] < c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = (char) temp;
				}
			}
		}
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] != c[i + 1]) {
				System.out.print(c[i] + " ");
			}
		}
	}
}
