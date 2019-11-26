package com.seleniumtutorial;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
	 WebDriver driver = new FirefoxDriver();
	
	public String PageloadTime(String xpath,String xpathForPageTitle) throws Exception
	{ 
		 StopWatch pageLoad = new StopWatch();
		 pageLoad.start();
		 WebDriverWait wait = new WebDriverWait(driver,1200);
		 WebElement element= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		 element.click();
		 WebElement element1=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		 String ash=element1.getText();
		 System.out.println(ash);
		 pageLoad.stop();
		 //Get the time
		 long pageLoadTime_ms = pageLoad.getTime();
		 //long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
		 String loadtime=pageLoadTime_ms+""+" MS";
		 return (loadtime);
		}
}
