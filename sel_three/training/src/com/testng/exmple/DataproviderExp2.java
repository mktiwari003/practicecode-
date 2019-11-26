package com.testng.exmple;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExp2 {
	
	
	 
	
	  @Test(dataProvider = "create", dataProviderClass = StaticProvider.class)
	  public void test(Integer n) {
		  
		  
		  System.out.println(n);
	    // ...
	  }

	 
	}

