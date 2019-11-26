package com.netlink;

public class StaticNonStaitc {
	
	
	   int rollno;  
	   String name;  
	   static String college = "mnit";  
	     
	   StaticNonStaitc(int r,String n){  
	   rollno = r;  
	   name = n; 
	   }  
	 
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	 public static void main(String args[]){  
		  
		 StaticNonStaitc s1 = new StaticNonStaitc(111,"testing");  
		 StaticNonStaitc s2 = new StaticNonStaitc(222,"automation");  
	     
		 
		 s1.display();  
	     s2.display();  
	 }  

}
