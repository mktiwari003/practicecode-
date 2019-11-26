package com.statics;

public class StudentExp2 {
	////Program of changing the common property of all objects(static field).  
	
	  int rollno;  
	     String name;  
	     static String college = "ITS";  
	       
	    static void change(){  
	     college = "BBDIT";  
	     }  
	  
	     StudentExp2(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	     public static void main(String args[]){  
	    	
	    	// StudentExp2.change();  
	    	 
	  
	    	StudentExp2 s1 = new StudentExp2 (111,"Karan");  
	    	StudentExp2 s2 = new StudentExp2 (222,"Aryan");  
	    	StudentExp2 s3 = new StudentExp2 (333,"Sonoo");  
	       
	       s1.display();  
	       s2.display(); 
	       s3.change();
	       s3.display(); 
	       s2.change();
	       s2.display(); 
	     }  

}
