package com.interface2;
//In other words, Interface fields are public, static and final by default, 
//and methods are public and abstract.


public interface BydefaultMethod {
	//Since Java 8, we can have method body in interface. 
	// But we need to make it default method.
	void draw();  
	//default void msg(){System.out.println("default method");}  

}
