package com.netlink;

public class ConstroctorEx1 {

	
	    int id  ;  
	    
	    String name;  
	    
	    boolean result;
	    
	    ConstroctorEx1(){
	    	
	    }
	    
	  
	      
	    ConstroctorEx1 (int id , String name){
	    	this.id = id;
	    	this.name = name ;
	   
	    }
	    
	    ConstroctorEx1 (int id , String name, boolean result){
	    	this.id = id;
	    	this.name = name ;
	    	this.result = result ;
	   
	    }
	  
	    void vaibhav(){
	    	System.out.println(id+" "+name+"  "+result );}  
	    void kunal(int i){
	    	System.out.println(i+"  "+id+" "+name+"  "+result );}  
	   
	    public static void main(String args[]){  
	    	ConstroctorEx1 s = new  ConstroctorEx1();  
	    	ConstroctorEx1 s1 = new ConstroctorEx1(111,"testing");  
	       
	    	ConstroctorEx1 s2 = new ConstroctorEx1(222,"automation");  
	        
	    	ConstroctorEx1 s3 = new ConstroctorEx1(222,"automation", true );
	    	 s.kunal(10);
	    	// s1.vaibhav();  
	        // s2.vaibhav(); 
	        // s3.vaibhav();
	         
	        
	   }  

}
