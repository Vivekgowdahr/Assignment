package com.te.exceptionall;

public class Reselt {
	private String name;
	private int marks;
	 
	public Reselt(String b, int c) throws BelowAverage {
		if (marks < 49) {
			throw new BelowAverage(" Below Average ...! Try for Remock");
			
		} else {
			this.marks=marks;
			this.name=name;
			System.out.println("good..! You are over with the mock try to improve");

		}
		
	}
	

}
