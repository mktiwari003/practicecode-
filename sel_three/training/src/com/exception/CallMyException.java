package com.exception;
public class CallMyException {
	
	 public static void main(String args[]){
	       try{
	          throw new MyException("Testing threeeeeee");
	          // I'm throwing user defined custom exception above
	       }
	       catch(MyException exp){
	          System.out.println("Hi this is my catch block") ;
	          System.out.println(exp) ;
	       }
	    }

}
