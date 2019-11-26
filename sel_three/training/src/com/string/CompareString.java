package com.string;

public class CompareString {
	
	
	 public static void main(String args[]){
	      String str = "Hello World";
	      String anotherString = "hello world";
	     

	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	 }

}
