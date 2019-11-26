package com.interface2;
//In other words, Interface fields are public, static and final by default, 
//and methods are public and abstract.


public class TestStaticMethod implements StaticMethod {
  
	public void draw(){System.out.println("drawing rectangle");}  
	
	public static void main(String[] args) {
		StaticMethod d=new TestStaticMethod();  
		d.draw();  
		//System.out.println(StaticMethod.cube(3)); 

	}

}
