package com.netlink;

public class ThisEx3 {
	 int id;  
	    String name;  
	    String city;  
	      
	    ThisEx3(int id,String name){  
	    this.id = id;  
	    this.name = name;  
	    }  
	    ThisEx3(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	    public static void main(String args[]){  
	    	ThisEx3 e1 = new ThisEx3(111,"testing");  
	    	ThisEx3 e2 = new ThisEx3(222,"Autoamtion","bhopal");  
	        e1.display();  
	       e2.display();  
	   }  

}
