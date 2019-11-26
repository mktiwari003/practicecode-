package com.collection;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("strting");
		HashMap map1 = new HashMap();
		System.out.println(map1);
		map1.put("key1","data");
		map1.put("key2","data");
		map1.put("key3","data");
		map1.put("key3","data");
		System.out.println(map1.size());
		System.out.println(map1);
		System.out.println(map1.values());
		
		 Collection c = map1.values();
		    Iterator itr = c.iterator();
		    while (itr.hasNext()) {
		      System.out.println(itr.next());
		    }
	}

}
