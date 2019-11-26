package com.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/slider/");
	      
	      WebElement source = driver.findElement(By.xpath("//ul[@id='menu-top']/li[3]/a"));
	      Actions act = new Actions(driver);
	      //act.moveToElement(source).keyDown(Keys.SHIFT).click(source).keyUp(Keys.SHIFT).perform();
	      act.keyDown(Keys.SHIFT).click(source).keyUp(Keys.SHIFT).perform();
	}

}
