package com.statics;

public class StudentExp1 {
	
	 int rollno;  
	   String name;  
	   static String college ="ITS";  
	     
	   StudentExp1(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	 public static void main(String args[]){  
		 StudentExp1 s1 = new StudentExp1(111,"Karan");  
		 StudentExp1 s2 = new StudentExp1(222,"Aryan");  
	   
	 s1.display();  
	 s2.display();  
	 }  

}
