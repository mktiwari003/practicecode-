package com.miscellaneous;

import java.util.Scanner;

public class ReversalOFVshape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("enter row to print");
	    int  n = in.nextInt();
	     
	    for(int i = 1; i<=n ; i++){
	    	
	    	 for(int j = 1; j<= n-i ; j++){
	    		 
	    		 System.out.print("*");
	    	 }
	    	
          for(int k = 1; k<= 2*i-2 ; k++){
	    		 
	    		 System.out.print(" ");
	    	 }
          for(int p = 1; p<= n-i ; p++){
	    		 
	    		 System.out.print("*");
	    	 }
	    
	         System.out.println(" ");
	    }
	    
	    

	}

}
