package com.miscellaneous;

import java.util.Scanner;

public class PalindroneInBnUsingWhile {

	public static void main(String[] args) {

		int start = 11,  i=0 ;
		
		      int remainder ; 
		    //Take input from the keyboard
		     Scanner  sc  = new Scanner(System.in);
		     System.out.println("Enter Starting boundary");
		     int count = sc.nextInt();    
		     System.out.println("Enter Ending boundary");
		     int NoOfPal = sc.nextInt();
		     
		     if (NoOfPal<count){
		    	 
		    	 System.out.println("End boundry shpuld be larger then starting boundary");
		     }
		      
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
