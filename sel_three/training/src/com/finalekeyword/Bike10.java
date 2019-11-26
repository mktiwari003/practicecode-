package com.finalekeyword;

public class Bike10 {
	//Yes, but only in constructor. For example:
	
	final int speedlimit;//blank final variable 

	Bike10(){  
		  speedlimit=70;  
		  System.out.println(speedlimit);  
		  }  
	
	public static void main(String args[]){  
	    new Bike10();  
	 } 
}
