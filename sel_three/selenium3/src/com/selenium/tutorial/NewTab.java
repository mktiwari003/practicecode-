package com.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {
	
	//Ctrl+Shift+Click
	
public static void main(String[] args) {
		
		
		  
	System.setProperty("webdriver.chrome.driver", "D:\\SMR\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/slider/");
	      
	 
	      
	      WebElement source = driver.findElement(By.xpath("//ul[@id='menu-top']/li[3]/a"));
	      Actions act = new Actions(driver);
	      act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(source).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();
	      
	      
	}

}
