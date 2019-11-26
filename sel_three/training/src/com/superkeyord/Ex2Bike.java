package com.superkeyord;

public class Ex2Bike extends Ex2Vehicle {
	 int speed=100;  
     
	  void display(){  
	   System.out.println(super.speed);//will print speed of Vehicle now  
	  } 
	
	public static void main(String[] args) {
		 Ex2Bike b=new Ex2Bike();  
		   b.display();   

	}

}
