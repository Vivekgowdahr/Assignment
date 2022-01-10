package com.te.exceptionall;

import java.util.Scanner;

public class App  {
	
	public static void main(String[] args) throws AgeAnimlException {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the name of the animal you need");
		String b = a.nextLine();
	
			System.out.println("Enter the age");
			int c=a.nextInt();
			Animal Dog=new Animal(b, c);
			
		
	}
}
