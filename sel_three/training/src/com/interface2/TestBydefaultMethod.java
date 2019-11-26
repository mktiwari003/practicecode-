package com.interface2;
//In other words, Interface fields are public, static and final by default, 
//and methods are public and abstract.

public class TestBydefaultMethod implements BydefaultMethod {
	//Since Java 8, we can have method body in interface. But we need to make it default method.
	public void draw(){System.out.println("drawing rectangle");}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BydefaultMethod d=new TestBydefaultMethod();  
		d.draw();  
		//d.msg();  
		
		
	}

}
