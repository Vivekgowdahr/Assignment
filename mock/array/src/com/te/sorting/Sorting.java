package com.te.sorting;

import java.util.Scanner;

public class Sorting {
public static void main(String[] args) {
	//Scanner a=new Scanner(System.in);
	int[]a= {1,20,3,60,8,12,59,23,65,79,2,6,512,2,5,2};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]<a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println(a[a.length-1]);
}
}
