package com.miscellaneous;

import java.util.Scanner;

public class RightSideV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 System.out.println("enter row nomore than 6 row");
	    int  n = in.nextInt();
	
	for(int i = 1 ; i <= 2*n ; i++) {
		
	 for(int j =1 ; j<= (n-i)+1 ; j++){
			 
			 System.out.print("*");
		 }
		
       for(int k = n ; k <= n+(i-n)  ; k++){
			 
			 System.out.print("*");
		 }
		
		System.out.println(" ");
		
	}
	
	
	}

}
