package com.testng.exmple;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExp1 {
	
	
	//This test method declares that its data should be supplied by the Data Provider
		//named "test1"
		@Test(dataProvider = "test1")
		public void verifyData1(String n1, Integer n2) {
		 System.out.println(n1 + " " + n2);
		}
	

	//This method will provide data to any test method that declares that its Data Provider
	//is named "test1"
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 
		return new Object[][] {{ "Cedric", new Integer(36) },
	                        { "Anne", new Integer(37)},
	                       };
	}
	 
	

	
	
}
