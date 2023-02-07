package com.app.java;

public class ChainingConstructor {
	public ChainingConstructor() {
		this(19);
		System.out.println("details");
		
	}
public ChainingConstructor(String name) {
	System.out.println(name);
	
		
	}
public ChainingConstructor(int age) {
	this("Afrath");
	System.out.println(age);
	
}
public static void main(String[] args) {
	ChainingConstructor c=new ChainingConstructor();
}

}
