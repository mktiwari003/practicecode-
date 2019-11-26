package com.string;

public class ConvertFirstCharaterOfWordInUpper {

	public static void main(String[] args) {
		
		 String str = "string abc touppercase";
	       
		  String strresult = str.substring(0,1).toUpperCase()+"tring " +str.substring(7,8).toUpperCase()+"bc "+ str.substring(11,12).toUpperCase()+"oppercase";  
		 System.out.println(strresult);
		 		 
		 String strUpper = str.toUpperCase();
	      System.out.println("Original String: " + str);
	      System.out.println("String changed to upper case: "+ strUpper);

	}

}
