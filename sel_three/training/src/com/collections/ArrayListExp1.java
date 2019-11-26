package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Ravi");//Adding object in arraylist  
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  //Traversing list through Iterator  
		  
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

		 //Traversing using for loop 
		  
		  for(String str:list){
			  
			  System.out.println(str);
		  }
		  
		  System.out.println(list.get(1));
		  
		  System.out.println(list.size());
		  
		  
		
	}

}
