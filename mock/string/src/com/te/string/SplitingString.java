package com.te.string;

import java.util.Scanner;

public class SplitingString {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the string");
		String b = a.nextLine();

		System.out.println("ware you want to split");
		String d = a.nextLine();
		System.out.println("Split required");
		int c = a.nextInt();
		String[] e = b.split(d, c);
		for (String f : e) {
			System.out.println(f);
		}
	}
}