package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExp {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  //Traversing elements  
		  System.out.println("Traversing elements using iterators");
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  //Traversing elements using for each  
		  System.out.println("Traversing elements using for each");
		   for(String str:set) {  
		   System.out.println(str);  
		  } 
      
	
	}
	
	
	

}
