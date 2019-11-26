package com.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSliders {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/slider/");
	      driver.switchTo().frame(0);
	      //driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	      
	      WebElement source = driver.findElement(By.xpath("//div[@id='slider']"));
	      Actions act = new Actions(driver);
	      act.dragAndDropBy(source, 50, 0).build().perform();
	}

}
