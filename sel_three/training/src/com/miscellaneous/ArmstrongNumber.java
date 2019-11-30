package com.miscellaneous;
//http://www.programmingsimplified.com/java/source-code/java-program-check-palindrome
import java.util.Scanner;
//This java program checks if a number is Armstrong or not. Armstrong number is a number which is equal to sum of digits raise to the power total number of digits in the number. Some Armstrong numbers are: 0, 1, 4, 5, 9, 153, 371, 407, 8208 etc.
public class ArmstrongNumber {
	public static void main(String args[])
	   {
	      int n, sum = 0, temp, remainder, digits = 0;
	 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Input a number to check if it is an Armstrong number");      
	      n = in.nextInt();
	 
	      temp = n;
	 
	      // Count number of digits
	 
	      while (temp != 0) {
	         digits++;
	         temp = temp/10;
	      }
	 
	      temp = n;
	 
	 //     Check Armstrongnumber  
	      
	      while (temp != 0) {
	         remainder = temp%10;
	         sum = sum + power(remainder, digits);
	         temp = temp/10;
	      }
	 
	      if (n == sum)
	         System.out.println(n + " is an Armstrong number.");
	      else
	         System.out.println(n + " is not an Armstrong number.");         
	   }
	 
	
	
	// Take power of a number 
	   static int power(int n, int r) {
	      int c, p = 1;
	 
	      for (c = 1; c <= r; c++) 
	         p = p*n;
	 
	      return p;   
	   }
}