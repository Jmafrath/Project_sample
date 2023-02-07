package com.app.java;

public class StringConcept {
public static void main(String[] args) {
	
	
	//literal
	
	String s="java";
	
	//charAt
	char charAt = s.charAt(1);
	System.out.println(charAt);
	
	//add with string 
	String concat = s.concat(s);
	System.out.println(concat);
	
	boolean contains = s.contains("u");
	System.out.println(contains);
	
	boolean endsWith = s.endsWith("a");
	System.out.println(endsWith);
	
	boolean equals = s.equals("java");
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("JAVA");
	System.out.println(equalsIgnoreCase);
	
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	int indexOf = s.indexOf("a");
	System.out.println(indexOf);
	
	int length = s.length();
	System.out.println(length);
	
	int compareTo = s.compareTo(s);
	
	System.out.println(compareTo);
	
	String b="Welcome to my universe";
	String lowerCase = b.toLowerCase();
	System.out.println(lowerCase);
	
	String substringg=b.substring(5);
	System.out.println(substringg);
	
	
	String trim = b.trim();
	System.out.println(trim);
	
	String replace = b.replace('e', 'm');
	System.out.println(replace);



}

}
