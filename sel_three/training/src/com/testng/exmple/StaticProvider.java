package com.testng.exmple;

import org.testng.annotations.DataProvider;

public class StaticProvider {
	@DataProvider(name = "create")
	  public static Object[][] createData() {
	    
		return new Object[][] {
	     
			new Object[] { new Integer(500) }
	    };
	  }

}
