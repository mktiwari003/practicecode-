package com.finalekeyword;

public class Bike2 {
	
	int cube(final int n){  
		  // n=n+2;//can't be changed as n is final  
		   return n; 
		  }  

	public static void main(String[] args) {
		 Bike2 b=new Bike2();  
		    b.cube(5);  
	}

}
