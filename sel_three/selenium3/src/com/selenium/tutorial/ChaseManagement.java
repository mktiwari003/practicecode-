package com.selenium.tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChaseManagement {

	public static void main(String[] args) 
		throws InterruptedException {
			  

			  System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
			  
			     
			      
			      ChromeDriver driver = new ChromeDriver();
			     // driver.get("https://jqueryui.com/slider/");
			      driver.navigate().to("https://jqueryui.com/slider/");
			     
			      List<WebElement>  sidemenuitems = driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]//ul/li/a"));  
			  
			     
			     for(int i = 0; i<= sidemenuitems.size()-1; i++) {
			      System.out.println( sidemenuitems.get(i).isDisplayed());
			     // JavascriptExecutor jse = (JavascriptExecutor)driver;
			      
			      //jse.executeScript("window.scrollBy(0,250)", "");
			     // jse.executeScript("scroll(165, 547);");
			      sidemenuitems.get(i).click();
			     
			      Thread.sleep(2000);
			      sidemenuitems = driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]//ul/li/a"));
			       
			      }
	}

}
