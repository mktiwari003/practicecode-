package com.superkeyord;

public class Ex1Bike extends Ex1Vehicle{
	 int speed=100;  
	  void display(){  
	   System.out.println(speed);//will print speed of Bike   
	  } 
	public static void main(String[] args) {
		 Ex1Bike b=new Ex1Bike();  
		   b.display(); 	
        
	}

}
