package com.app.java;

public class AbstractObjectClass extends Abstraction {

	@Override
	public void sample() {
		// TODO Auto-generated method stub
		System.out.println("abstract method from child class");
	}
	public static void main(String[] args) {
		AbstractObjectClass abc=new AbstractObjectClass();
		abc.sample();
		Abstraction.sample2();
	}
	@Override
	void sampleNew() {
		// TODO Auto-generated method stub
		
	}

	
}
