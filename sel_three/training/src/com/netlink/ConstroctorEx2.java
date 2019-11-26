package com.netlink;

public class ConstroctorEx2 {
	
	    int id;  
	    String name;  
	    int age;  
	    ConstroctorEx2(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    ConstroctorEx2(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	ConstroctorEx2 s1 = new ConstroctorEx2(111,"Karan");  
	    	ConstroctorEx2 s2 = new ConstroctorEx2(222,"Aryan",25);  
	       s1.display();  
	       s2.display();  
	   }  
	}  
