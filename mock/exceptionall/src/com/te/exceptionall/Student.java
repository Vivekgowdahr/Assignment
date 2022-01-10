package com.te.exceptionall;

import java.util.Scanner;

public class Student {
public static void main(String[] args) throws BelowAverage {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the name of the student");
	String b=a.nextLine();
	
	System.out.println("Enter the marks of the Student");
	int c=a.nextInt();
	
	Reselt reselt = new Reselt(b,c);
	System.out.println();
	
	
}
}
