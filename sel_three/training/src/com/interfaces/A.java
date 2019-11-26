package com.interfaces;

 public class A implements Car{
	
	
	public  void run(){
		
		System.out.println("Running car every day");
	}
	
	
	 public void speedometer(){
		
		System.out.println("Maximum speed of car should be 100 Km/hr");
		
	} 

	
	 
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a = new A ();
       a.run();
       a.speedometer();
	}

	

}
