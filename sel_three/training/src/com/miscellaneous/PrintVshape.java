package com.miscellaneous;

import java.util.Scanner;

public class PrintVshape {

	/**
	 *             *
	 * *         * *
	 * * *     * * *   
	 * * * * * * * *    
	 */
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("enter row to print");
	    int  n = in.nextInt();
	 
		for (int i =1 ; i <= n ; i++ ){
			
			 for(int j =1; j <= i ; j++ ){
				  System.out.print("*");
				 }

			 for(int k =1; k <= n*2-2*i ; k++ ){
				  System.out.print(" ");
				 }
			 for(int l =1; l <= i ; l++ ){
				  System.out.print("*");
				 }
		System.out.println(" ");
		}

	}

}
