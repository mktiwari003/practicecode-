package com.ecort.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyBrokenLink {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com");
	      
	      List<WebElement> linklist = driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]//ul/li/a"));
	      
	      // Actions act = new Actions(driver);
	       
	      
	      
	      
	      for(int i=0 ; i <= linklist.size()-1; i++ ){
	    	   
	    	// act.click(linklist.get(i)).perform();
	    	  
	    	  linklist.get(i).click();
	    	  
	    	  linklist = driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]//ul/li/a"));
	    	  
	      }
		

	}

}
