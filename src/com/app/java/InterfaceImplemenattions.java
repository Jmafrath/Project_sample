package com.app.java;

public class InterfaceImplemenattions implements Interface{

	@Override
	public void sample3() {
		// TODO Auto-generated method stub
		System.out.println("Method from interface ");
		
	}
	public static void main(String[] args) {
		Interface.interfacesample2();
		
		InterfaceImplemenattions simple=new InterfaceImplemenattions();
		simple.interfacesample();
		simple.sample3();
		
	}

	
	
}
