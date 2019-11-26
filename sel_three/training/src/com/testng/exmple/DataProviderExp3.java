package com.testng.exmple;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExp3 {
	
	 
	@Test(dataProvider = "dp")
	public void test1(String s) {
		System.out.println(s);
	}
	 
	@Test(dataProvider = "dp")
	public void test2(String s) {
		System.out.println(s);
	}

	@DataProvider(name = "dp")
	public Object[][] createData(Method m) {
	  System.out.println(m.getName());  // print test method name
	  return new Object[][] { new Object[] { "Cedric" }};
	}
	
}
