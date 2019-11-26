package com.finalekeyword;

public class Honda extends Bike {
	/* Is final method inherited?

     Yes, final method is inherited but you cannot override it. */
	// void run(){System.out.println("running safely with 100kmph");} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda honda= new Honda();  
		   honda.run();
	}

}
