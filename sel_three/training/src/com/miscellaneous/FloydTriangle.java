package com.miscellaneous;

import java.util.Scanner;

public class FloydTriangle {
	
	/**
	 *http://www.programmingsimplified.com/java-source-codes 
	 */
	
	public static void main(String args[])
	   {
	      int n, num = 1, c, d;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows of floyd's triangle you want");
	      n = in.nextInt();
	 
	      System.out.println("Floyd's triangle :-");
	 
	      for ( c = 1 ; c <= n ; c++ ){
	    	  
	    	
	    	  for (int j=1 ; j<= n-c; j++){
	    		   System.out.print(" ");
	    	       } 
	    	  
	    	  
	    	  for(int k=1 ; k<= 2*c-1; k++  ){
	    		  System.out.print("*");
	    	       }
	    	
	    	      System.out.println(" ");
	   }
}
}