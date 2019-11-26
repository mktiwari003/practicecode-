package com.miscellaneous;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial2 {
	/*Above program does not give correct result for calculating factorial of say 20. 
	 * Because 20! is a large number and cant be stored in integer data type which is of 4 bytes. To calculate factorial of say hundred we use BigInteger class of java.math package.
	
	*/
	
	
	public static void main(String args[])
	  {
	    int n, c;
	  
	    
	    BigInteger inc = new  BigInteger("1");
	    
	    BigInteger fact = new BigInteger("1");
	 
	    Scanner input = new Scanner(System.in);
	 
	    System.out.println("Input an integer");
	    n = input.nextInt();
	 
	    for (c = 1; c <= n; c++) {
	      fact = fact.multiply(inc);  
	      inc = inc.add(BigInteger.ONE);
	     
	    }
	 
	    System.out.println(n + "! = " + fact);
	  }
}
