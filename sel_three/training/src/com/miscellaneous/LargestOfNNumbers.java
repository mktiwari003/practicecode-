package com.miscellaneous;

import java.util.Scanner;

public class LargestOfNNumbers {

	public static void main(String[] args) {
		  int n, c, d, swap;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Input number of integers to sort");
		    n = in.nextInt();
		 
		    int array[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers");
		 
		    for (c = 0; c < n; c++) 
		      array[c] = in.nextInt();
		 
		    for (c = 0; c < ( n - 1 ); c++) {
		      
		        if (array[c] > array[c+1]) /* For descending order use < */
		        {
		          swap       = array[c];
		          array[c]   = array[c+1];
		          array[c+1] = swap;
		        }
		      }
		    
		 
		    System.out.println("Sorted list of numbers");
		 
		    for (c = 0; c < n; c++) 
		      System.out.println(array[c]);
	}
	}

