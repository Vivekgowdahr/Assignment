package com.te.exceptionall;

public class VoterID {

	//Fields
	private String name;
	private int age;
	public VoterID(String name,int age) throws BelowAge {
		if (age<=18) {
			throw  new BelowAge("The person is not eligibal to vote :"+age);
		} else {
			this.age=age;
			this.name=name;
			System.out.println("eligibal to vote");	
	}
		}	
}