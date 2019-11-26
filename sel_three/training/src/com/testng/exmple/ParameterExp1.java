package com.testng.exmple;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExp1 {
	
	
	@Parameters({ "first-name" })
	
	@Test(groups ={"regression"})
	
	public void testSingleString(String firstName) {
	  
		System.out.println("Invoked testString " + firstName);
	  
	  assert "Cedric".equals(firstName);
	}

	

}
