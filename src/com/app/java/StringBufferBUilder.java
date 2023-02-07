package com.app.java;

public class StringBufferBUilder {

	public static void main(String[] args) {
		
		
		String a ="Jainul";
		StringBuffer bf=new StringBuffer(a);
		StringBuffer append = bf.append("afrath");
		//System.out.println(append);
		//StringBuffer reverse = bf.reverse();
		//System.out.println(reverse);
		
		//System.out.println(bf.insert(0, "M"));
		
		StringBuffer replace = bf.replace(1, 3, "AF");
		System.out.println(replace);
	}
}
