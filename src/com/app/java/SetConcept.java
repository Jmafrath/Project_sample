package com.app.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConcept {
	public static void main(String[] args) {
		
		HashSet s=new HashSet();
		s.add("afrath");
		s.add(154);
		s.add("");
		//System.out.println(s);
		//Iterator iterator = s.iterator();
		//System.out.println(s);
		//while(iterator.hasNext()) {
		//	System.out.println(iterator.next());
		//}
	//	System.out.println(iterator);
		
		//LinkedHashset
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("java");
		ls.add("Selenium");
		ls.add(54);
		ls.add(54);
		ls.add(null);
		ls.add(587);
		ls.add(null);
		
		//System.out.println(ls);

		
		
		TreeSet<Object> se= new TreeSet<Object>();
		se.add(10);
		se.add(0);
		se.add(30);
	 	//se.add("Afrath");
	    //se.add("Jainul");
		System.out.println(se);
		//System.out.println(se.higher(0));
		//System.out.println(se.lower(10));
		
		//System.out.println(se.tailSet(30));
		//se.add(null);
		
	   // SortedSet headSet = se.headSet(30);
	    //System.out.println(headSet);
	
		
		
		//Object ceiling = se.ceiling(se);
	    
		
		
	
		
	}

}
