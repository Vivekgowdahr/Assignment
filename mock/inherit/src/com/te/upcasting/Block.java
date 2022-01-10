package com.te.upcasting;

public class Block {
	public static Boolean isprime(int n) {
		for (int i = 2; i < n; i++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 50;
		for (int i = num1; i < num2; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}
		}

	}
}
