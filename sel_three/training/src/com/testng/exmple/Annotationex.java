package com.testng.exmple;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationex {
	
	@BeforeTest()
	public void test1(){
		
		System.out.println("Running before test annotations");
	}
	
   @Test()	
   public void test2(){
		
		System.out.println("Running the test annotation one");
	}
   @Test()
   public void test3(){
	
	 System.out.println("Rnning the test annoatation two");
    }

    @AfterTest()
    public void test4(){
	
	  System.out.println("Running after test annotation");
    }
}
