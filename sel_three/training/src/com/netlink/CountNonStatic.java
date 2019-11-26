package com.netlink;
//http://www.javatpoint.com/static-keyword-in-java
public class CountNonStatic {
	
	
	static int count=0;//will get memory only once and retain its value  
	  
	 CountNonStatic(){  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
		 CountNonStatic c1 = new  CountNonStatic();  
		 CountNonStatic c2 = new  CountNonStatic();  
		 CountNonStatic c3 = new  CountNonStatic();  
	  
	 }  

}
