package com.exception;

import java.io.IOException;

public class ThrowThrowsExp2 {
	
	void mymethod(int num)throws IOException, ClassNotFoundException{ 
	     if(num==1)
	        throw new IOException("Exception Message1");
	     else
	        throw new ClassNotFoundException("Exception Message2");
	  } 
	} 

	class Demo{ 
	  public static void main(String args[]){ 
	   try{ 
		
		   ThrowThrowsExp2 obj=new ThrowThrowsExp2(); 
	        obj.mymethod(1); 
	   
	   }catch(Exception ex){
	     System.out.println(ex);
	    } 
	  }

}
