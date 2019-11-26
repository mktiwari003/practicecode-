package com.ecort.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	          
	      
	      // swith to frame by index
	     // driver.switchTo().frame(0);
	      
	   // swith to frame by taking frame as webelement
	      driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	      
	      Actions act = new Actions(driver);
	      
	      WebElement  x = driver.findElement(By.id("draggable"));
	      
	      WebElement y = driver.findElement(By.id("droppable"));
	      
	      act.dragAndDrop(x, y).build().perform();
	      
	      
	     
	}

}
