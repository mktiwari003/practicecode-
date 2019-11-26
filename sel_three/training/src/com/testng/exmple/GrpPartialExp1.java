package com.testng.exmple;

import org.testng.annotations.Test;

@Test(groups = { "smoke" })
public class GrpPartialExp1 {
	
	
	
	 
	  @Test(groups = { "Regression"} )
	  public void method1() { 
		  
		  System.out.println("Running test method1");
	  }
	  
	 
	  public void method2() { 
		  
		  System.out.println("Running test method2");
		  
		  }
	 
	  
	  }
	
	
	

