package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeIndiaIframe {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver  = new  FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.get("http://timesofindia.indiatimes.com/sports");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//nav[@id='navigation']/div/div[2]/span")).click();
	  
	     Thread.sleep(3000);
	    
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    /* JavascriptExecutor js = (JavascriptExecutor) driver; 
	 	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//form[@id='pollform']//div/a[3]")));
	 	  Thread.sleep(3000);*/
	     WebElement elmt = driver.findElement(By.xpath("//div[@id='c_widget_gocricket_22']//iframe")) ;
	     js.executeScript("scroll(0, 4550);");
	    // driver.switchTo().frame(elmt);
	   //  driver.findElement(By.xpath("//span[text()='ENG']")).click();
	     
	}

}
