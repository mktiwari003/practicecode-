package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp2 {

	public static void main(String[] args) {
		
		A a1 = new A(1,"testing1", 21 );
		A a2 = new A(2,"testing2", 22 );
		A a3 = new A(3,"testing3", 26 );
		
		ArrayList<A> a = new ArrayList<A>();
		a.add(a1);
		a.add(a2);
		a.add(a3);
		
		Iterator itr = a.iterator(); 
		 while(itr.hasNext()){
			 //System.out.println(itr.next());
			 A aa = (A)itr.next(); 
			 System.out.println(aa.i +" " + aa.str+" "+aa.age);
		 }
		
		
		

	}

}
