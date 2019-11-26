package com.ecort.training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenlinkinNewtab {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      
	      Actions act = new Actions(driver);
	      
	      
	      // CTRL + Shift + Click
	      
	      WebElement target = driver.findElement(By.xpath("//ul[@id='menu-top']/li[3]/a"));
	      
	      act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(target).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();	      
	     
	}

}
