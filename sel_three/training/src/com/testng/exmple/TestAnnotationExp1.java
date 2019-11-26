package com.testng.exmple;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationExp1 {
	WebDriver  driver;
	
	@BeforeTest()
	public void setCongiguration(){
		
		System.out.println("running before test annotation");
		  System.setProperty("webdriver.chrome.driver","D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	        //System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	          driver  = new ChromeDriver();
	          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	          driver.get("https://www.amazon.in/your-account");
	            
		}
	
	
	@Test()
	public void Test1(){
		System.out.println("running test1 test annotation");
		 driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']")).click();
	        driver.findElement(By.id("ap_email")).sendKeys("rajeshwarinema20@gmail.com");
	        driver.findElement(By.id("ap_password")).sendKeys("paramaatma@1234");
	        driver.findElement(By.id("signInSubmit")).click(); 
	        
		
	}
	
	@Test()
	public void Test2(){
		System.out.println("running test2 test annotation");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samesung phone");
         driver.findElement(By.xpath("//div[span[text()='Go']]/input")).click();
         driver.findElement(By.xpath("//div[@id='centerMinus']//li[1]//img")).click();
        // Thread.sleep(1000);
         Set<String> windowhandlor=driver.getWindowHandles();
         Iterator<String> it = windowhandlor.iterator();
         String w1= it.next();
         String w2=it.next();
         System.out.println(w1);//debugging trick
         System.out.println(w2);
         driver.switchTo().window(w2);
         driver.findElement(By.id("add-to-cart-button")).click();
		
	}
	@Test()
	public void Test3(){
		System.out.println("running test3 test annotation");
		
	}
	
	
	@Test()
	public void Test4(){
		
		System.out.println("running test4 test annotation");
	}
	
	@Test()
	public void Test5(){
		
		System.out.println("running test5 test annotation");
	}
	
	
	@AfterTest
     public void DisposeTest(){
		
		System.out.println("running Dispose test annotation");
	}
	
	
}
