package com.netlink;

public class ThisEx2 {
	     int id;  
	    String name;  
	    
	    
	    ThisEx2(){
	    	System.out.println("default constructor is invoked");
	    	}  
	      
	    ThisEx2(int id,String name){  
	    this ();//it is used to invoked current class constructor.  
	    this.id = id;  
	    this.name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	      
	    public static void main(String args[]){  
	    	ThisEx2  e1 = new ThisEx2(111,"testing");  
	    	ThisEx2 e2 = new ThisEx2(222,"automation");  
	       e1.display();  
	      e2.display();  
	   }  

}
