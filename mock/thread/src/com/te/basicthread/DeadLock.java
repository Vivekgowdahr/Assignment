package com.te.basicthread;

import java.util.*;

public class DeadLock {
	public static void main(String[] args) {
		String s1 = "vivek";
		String s2 = "Virat";

		Thread t1 = new Thread() {

			public void run() {
			synchronized (s1) {
				System.out.println("Thread 1 is locked");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
				synchronized (s2) {
					System.out.println("Thread 1 is locked");
				}
			}
			}
		};
		Thread t2 = new Thread(){
		public void run() {
		synchronized (s2) {
			System.out.println("Thread 2 is locked....");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		synchronized (s1) {
			System.out.println("Thread 2 is locked");
		}
		}
		}
		};
		t1.start();
		t2.start();
	}
}