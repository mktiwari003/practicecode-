package com.interface2;

//In other words, Interface fields are public, static and final by default, 
//and methods are public and abstract.

public class Test implements A,B{
	
	
	
	
	public void testing(){
		
		System.out.println("implemeting testing method of interface A and B");
	}	
    
	public static void main(String[] args) {
		
    System.out.println(A.i);
    System.out.println( B.i);
    
    
       Test t = new Test();
       t.testing();
      
      
	}

}
