package com.exception;

public class Throw_Throwsexp1 {
	
	
	static void throwMethod()
	   {
	       System.out.println ("Inside throwMethod");
	       throw new NullPointerException ("Demo"); 
	   } 
	  
	
	public static void main(String args[])
	   {
	       try
	       {
	          throwMethod();
	       }
	       catch (NullPointerException exp)
	       {
	          System.out.println ("The exception get caught" +exp);
	       }
	    }

}
