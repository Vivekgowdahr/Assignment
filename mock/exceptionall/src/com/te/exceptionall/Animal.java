package com.te.exceptionall;

public class Animal {

	//fields
	private String name;
	private int age;
	
	
	
	//parameterized constructor
	public Animal (String name,int age) throws AgeAnimlException {
		if (age<=0) {
			throw new AgeAnimlException("An animal object can't have a negative age :"+age);
		}
		else {
			this.age=age;
			this.name=name;
			System.out.println("you have created a dog");
		}
	}
	
//	
//	//methods
//	public void eat() {
//		
//	}
//	public void makeSound() {
//		
//	}
}
