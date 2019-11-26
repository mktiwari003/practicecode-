package com.miscellaneous;

import java.util.Scanner;

public class PalindroneFirstNUsingWhile {

	public static void main(String[] args) {
		
		int start = 11, count = 1 , i=0 ;
		
		      int remainder ; 
		    //Take input from the keyboard
		     Scanner  sc  = new Scanner(System.in);
		     System.out.println("Enter no of palindrone to be printed");
		     int NoOfPal = sc.nextInt();
	           
		      
		        while(count<= NoOfPal){
			
				int temp = start;
				i = 0 ;
				
				//reverse number
				while(temp>0){
			    remainder = temp%10;
		        i = i *10 + remainder;
		         temp = temp/10;
		                      }
		      
				//check for palindrone
			    if(i == start) {
			        
			    	System.out.println(count+"->"+i);
			        //increase counter
			        count++;
		                       }
			 
		    
			    start = start +1;
		    
			
	
	  }
		 
	}

	}


