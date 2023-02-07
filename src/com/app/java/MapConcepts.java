package com.app.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapConcepts {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Afrath", 12);
		m.put("Afrath", 24);
		m.put(15, 12);
		m.put(null, null);
		m.put(145, null);
		
		System.out.println(m);
		
		
		LinkedHashMap lmp=new LinkedHashMap();
		//lmp.
		
		
		//treemap wont allow null
		TreeMap tm=new TreeMap();
		
		tm.put("Afrath", 154);
		
		///tm.put(null, tm);
		Collection values = tm.values();
		System.out.println(values);
		System.out.println(tm);
		
		//entryset
		//System.out.println(m.entrySet());
		
		
		//keyset method
		//Set keySet = m.keySet();
		//System.out.println(keySet);
		
		//get method-will pull out the correponding value
		//System.out.println(m.get(15));
		
		// containskey method
		// boolean containsKey = m.containsKey("Afrath");
//		System.out.println(containsKey);

		// entry set method
		// Set entrySet = m.entrySet();
		// System.out.println(entrySet);
		//System.out.println(m);

	}

}
