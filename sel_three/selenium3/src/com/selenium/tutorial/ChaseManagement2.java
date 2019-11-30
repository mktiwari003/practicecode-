package com.selenium.tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChaseManagement2 {
    static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SMR\\chromedriver_win32\\chromedriver.exe");
	     
	     
	     driver = new ChromeDriver();
	     // driver.get("https://jqueryui.com/slider/");
	      driver.navigate().to("https://jqueryui.com/slider/");
	     
	   //   List<WebElement>  sidemenuitems = driver.findElements(By.xpath("//div[@id='sidebar']/aside[2]//ul/li/a"));  
	  
	      String part1 = "//div[@id='sidebar']/aside[2]//ul/li[";
	      String part2 = "]/a";
	      int i = 1;
	     
	     while(isElementPresent(part1+i+part2)) {
	    	 JavascriptExecutor jse = (JavascriptExecutor)driver;
		      
		      //jse.executeScript("window.scrollBy(0,250)", "");
		      jse.executeScript("scroll(165, 547);"); 
	          String text = driver.findElement(By.xpath(part1+i+part2)).getText();
	          System.out.println(text);
	    	 
	          driver.findElement(By.xpath(part1+i+part2)).click();
	          i++;
	      
	}
	}

     public static boolean isElementPresent(String xpath ){
    	
    	  List<WebElement> linkElement = driver.findElements(By.xpath(xpath));
    	  if(linkElement.size()==0){
    		  return false;  
    	  }
    	  else{
    		  return true;
    	  }
    	  }   








}
