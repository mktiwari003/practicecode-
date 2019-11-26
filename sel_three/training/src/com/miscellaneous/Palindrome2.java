package com.miscellaneous;

import java.util.Scanner;

public class Palindrome2 {
	/*
	 
	 	 Both the above codes consider string as case sensitive, you can modify them so that they ignore the case of string. You can either convert both strings to lower or upper case for this. But do not modify original strings as they may be further required in program.
	 	 */
	
	public static void main(String args[])
	  {
	    String inputString;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Input a string");
	    inputString = in.nextLine();
	 
	    int length  = inputString.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	      if (inputString.charAt(begin) == inputString.charAt(end)) {
	        begin++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    if (i == middle + 1) {
	      System.out.println("Palindrome");
	    }
	    else {
	      System.out.println("Not a palindrome");
	    } 	
	  }
}
