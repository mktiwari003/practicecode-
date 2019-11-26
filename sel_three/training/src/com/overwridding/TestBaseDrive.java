package com.overwridding;

public class TestBaseDrive {
	
	
	public static void main(String args[ ])  {
	       
		
		Base obj1 = new Derive();
	        
	       // As per overriding rules this should call to class Derive's static 
	       // overridden method. Since static method can not be overridden, it 
	       // calls Base's display() 
	       obj1.display();  
	        
	       // Here overriding works and Derive's print() is called 
	       obj1.print();     
	    }

}
