package com.testng.exmple;

import org.testng.annotations.Test;

public class ParallelExp1 {
	
	
	@Test(threadPoolSize = 3, invocationCount = 10,  timeOut = 10000)
	public void testA(){
		
		System.out.println(" TestA is running in thread id : A  " + Thread.currentThread().getId());
		
		
		
		
	}
	@Test()
	public void testB(){
		
		System.out.println(" TestB is running in thread id : B  " + Thread.currentThread().getId());

	}
	
	@Test()
	public void testC(){
		
		System.out.println(" TestC is running in thread id : C  " + Thread.currentThread().getId());
	}
}
