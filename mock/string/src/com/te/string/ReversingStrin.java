package com.te.string;

import java.util.Iterator;
import java.util.Scanner;

public class ReversingStrin {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the string");
		String b = a.nextLine();
		char c[] = b.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}
}