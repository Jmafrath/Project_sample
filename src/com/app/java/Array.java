package com.app.java;

public class ArrayConcept {
	public static void main(String[] args) {
		
		//single dimensional array
		int []a=new int[5];
		a[1]= 10;
		a[2]=20;
		//System.out.println(a[1]);
		
		//dynamic array
		int []a1= {1,2,3,4};
		//System.out.println(a1[2]);
		
		
		//using loop in single array
		
		int c[]=new int[4];
		c[0]=11;
		c[1]=12;
		c[2]=13;
		c[3]=14;
		
		for (int i = 0; i < c.length; i++) {
			//System.out.println(c[i]);
		}
		
		//multi dimensional arrray
		
		String [][]name=new String[2][2];
		
		name[0][0]="Afrath";
		name[0][1]="Jainul";
		
		name[1][0]="ajith";
		name[1][1]="Elon";
		
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {
				System.out.println(name[i][j]);
				
			}
		}
		
		
		
		
		
		
		
		}
	

}
