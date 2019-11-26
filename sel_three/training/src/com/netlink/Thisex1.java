package com.netlink;

public class Thisex1 {
	    int id;  
	    String name;  
	      
	    Thisex1(int id,String name){  
	   this.id = id;  
	  
	    this.name = name;
	   
	    }  
	    
	    
	    void display(){
	    	System.out.println(id+" "+name);
	    	}  
	   
	    
	    
	    public static void main(String args[]){  
	    	Thisex1 s1 = new Thisex1(111,"testing");  
	    	Thisex1 s2 = new Thisex1(222,"autoamtion");  
	        s1.display();  
	        s2.display();  
	}  

}
