package com.te.string;

import java.util.Scanner;

public class ReverStrWithInbilt {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String b=sc.nextLine();
		StringBuilder stringBuilder = new StringBuilder(b);
		stringBuilder.reverse();
		String rev=stringBuilder.toString();
		if (b.equals(rev)) {
			System.out.println("it is pallindrome");
		} 
		else {
			System.out.println("it is not pallindrome");
		}
	}
}
