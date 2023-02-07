package com.app.java;

public interface Interface {
	
	  default void interfacesample() {
		  System.out.println("Default method");
	}
	  static void interfacesample2() {
		  System.out.println("Satic method");
		  
	  }
	  
	  //interface
	  void sample3();

}
