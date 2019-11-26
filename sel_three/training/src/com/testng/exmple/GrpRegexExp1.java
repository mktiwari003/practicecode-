package com.testng.exmple;

import org.testng.annotations.Test;

public class GrpRegexExp1 {

	
	@Test(groups = { "windows.checkintest" })
	  public void testWindowsOnly() {
	   System.out.println("Running test on the windoes system");
	
	}
	 
	  @Test(groups = {"linux.checkintest"} )
	  public void testLinuxOnly() {
		  System.out.println("Running the test on the linix system");
	  }
	 
	  @Test(groups = { "windows.functest"} )
	  public void testWindowsToo() {
		  
		  System.out.println("Runningt 2nd test on windows two");
	  }

	
	
}
