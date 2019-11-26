package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExp {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		 //traversing of linkedlist using iterator
		  System.out.println("Travese the linked list using iterator");
		  Iterator<String> itr = al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
        // Traversing of linkedlist using for each loop 
		  System.out.println("Travese the linked list using for each");
		  for (String str:al ){
			  
			  System.out.println(str);
		  }
		// Access by index 
		  
		  System.out.println("Access by index value: "+al.get(1));  
	}

}
