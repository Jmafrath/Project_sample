package com.app.java;

public class Polymorphism {

	
	//method overloading//compiletime poly //static binding
	public static void test(String name) {
		System.out.println(name);
		
	}

	public static void test(long mobno) {
		System.out.println(mobno);
		
	}

	public static void test(String address,String email) {
		System.out.println(address+" "+email);
	}
	
	public static void main(String[] args) {
		//method overloading
	 test("afrath");
	}
	
	
	
}
