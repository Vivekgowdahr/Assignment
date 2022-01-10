package com.te.sorting;


public class RemovingDuplic {
public static void main(String[] args) {
	int a[]= {1,20,3,60,85,69,48,22,33,37,69,33,55,2,5,3,6,2};
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for (int i = 0; i < a.length-1; i++) {
		if (a[i]!=a[i+1]) {
			System.out.println(a[i]);
	}
	}
	
}
}
