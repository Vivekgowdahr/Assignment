package com.te.string;

import java.util.Iterator;
import java.util.Scanner;

public class StringPalon {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the string");
	String b=a.nextLine();
	char [] c=b.toCharArray();
	String reverse="";
	for (int i = c.length-1; i >=0 ; i--) {
		reverse=reverse+b.charAt(i);
	}
	if (reverse.equals(b)) {
		System.out.println("Pal");
	} else {
System.out.println("not Pal");
	}
}
}
