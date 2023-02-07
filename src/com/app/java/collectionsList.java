package com.app.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class collectionsList {
	public static void main(String[] args) {

		// list-ArrayList

		ArrayList<Object> li = new ArrayList<Object>();
		li.add(10);
		li.add("Afrath");
		// System.out.println(li);
		li.add(0, "Jainul");
		//System.out.println(li);
		Object object = li.get(0);

		// System.out.println(object);
		//System.out.println(li.size());

		// boolean remove = li.remove("Afrath");
		// System.out.println(remove);
		// System.out.println(li);

		// boolean removeAll = li.removeAll(li);
		// System.out.println(removeAll);
		// System.out.println(li);

		// li.clear();
		// System.out.println(li);

		// Collections.replaceAll(li,"Afrath","AFRATH");
		// System.out.println(li);

		
		List<Object> n = new ArrayList<Object>();
		n.add("Asif");
		n.add(378);
		//li.retainAll(n);
		//System.out.println(n);
		
		List<Object> subList = n.subList(0, 1);
		//System.out.println(subList);
		
		//List-LinkedList
		
		LinkedList ll=new LinkedList();
		ll.add("Afrath");
		ll.add(25);
		ll.add("java");
		ll.add(565);
		ll.add(25);
		li.add(null);
		//System.out.println(ll);
		ll.set(1, 54);
		//System.out.println(ll);
		String string = ll.toString();
	//	System.out.println(string);
		
		Object[] array = ll.toArray();
		for (int i = 0; i < array.length; i++) {
		//	System.out.println(array[i]);
		}
		
		Object removeFirst = ll.removeFirst();
		//System.out.println(removeFirst);
		//System.out.println(ll);
		
		boolean empty = ll.isEmpty();
		//System.out.println(empty);
		}
	
	

}
