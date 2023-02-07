package com.app.java;

public class Polymorphism2 extends Polymorphism {

	//runtime,dynamic,method override
	public static void test(String name) {
        System.out.println("sub class");
		System.out.println(name);
	}

	public static void test(long mobno) {
		System.out.println("sub class");

		System.out.println(mobno);
	}

	public static void main(String[] args) {
		Polymorphism2 p2 = new Polymorphism2();
		p2.test("sub afrath");
		Polymorphism p = new Polymorphism();
		p.test("parent afrath");

	}

}
