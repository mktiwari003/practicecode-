package com.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SMR\\chromedriver_win32\\chromedriver.exe");
	     
	      
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://jqueryui.com/droppable/");
	      driver.switchTo().frame(0);
	      //driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	      
	      WebElement source = driver.findElement(By.id("draggable"));
	      WebElement target = driver.findElement(By.id("droppable"));
	      Actions act = new Actions(driver);
	      act.dragAndDrop(source, target).build().perform();
	      //act.dragAndDropBy(source, 50, 0).build().perform();
	   
	}

}
