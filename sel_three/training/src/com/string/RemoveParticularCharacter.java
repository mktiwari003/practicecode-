package com.string;

public class RemoveParticularCharacter {
	
	
	public static void main(String args[]) {
	      String str = "this is Java";
	      System.out.println(removeCharAt(str, 6));
	  
	}
	  
	
	
	      public static String removeCharAt(String s, int indexval) {
	     
	    	  
	    	  return s.substring(0, indexval) + s.substring(indexval + 1);
	   }
}
