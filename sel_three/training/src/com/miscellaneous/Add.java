package com.miscellaneous;

import java.util.ArrayList;
import java.util.Scanner;

public class Add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer>  arr1  =  new  ArrayList<Integer>();
		ArrayList<Integer>  arr2  =  new  ArrayList<Integer>();
	   
	   
		
		
		Scanner n  = new   Scanner(System.in); 
        System.out.println("enter string range");
	     int n1 = n.nextInt(); //starting ?
	     System.out.println("enter last range"); 
	     int n2 = n.nextInt(); //end point ?
	   
	   
    

	 for (int i = n1 ; i<=n2 ; i++ ){

	               arr1.add(i);
	                 
	               arr2.add(i);
	              
	            int  j = i -n1; 
	            
	              int x = arr1.get(j);
	             
	              int y = arr2.get(j);
	 
	              int sum = x+y ;

	              System.out.println(sum);


	      }

	}

}
