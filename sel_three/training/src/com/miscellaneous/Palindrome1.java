package com.miscellaneous;

import java.util.Scanner;

public class Palindrome1 {
	
	/*
	Java palindrome program: Java program to check if a string is a palindrome or not. Remember a string is a palindrome if it remains unchanged when reversed, for example "dad" is a palindrome as reverse of "dad" is "dad" whereas "program" is not a palindrome. Some other palindrome strings are "mom", "madam", "abcba".
	
	*/
	
	 public static void main(String args[])
	   {
	      String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	 
	   }
}
