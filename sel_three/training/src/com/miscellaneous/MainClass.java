package com.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n1,n2;
		ArrayList<Integer> arr = new ArrayList();
		ArrayList<Integer> arr1 = new ArrayList();
		ArrayList<Integer> arr2 = new ArrayList();
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter the starting number");
		  n1 = in.nextInt(); 
		  System.out.println("Enter the starting number");
		  n2 = in.nextInt(); 
		//System.out.println(arr.size());
		
		for(int i = n1 ; i<=n2; i++)
		{    
			arr.add(i);
			arr1.add(i);
			
			int j = i -n1;
			int x = arr.get(j);
		     
			int y =  arr1.get(j);
			
			 int sum = x+ y ;
			 System.out.println(sum);
			 arr2.add(sum) ;
		}
	  
	
	System.out.println("size of array  " +arr2.size());
	}
	 
	     
	    
	         
	}


