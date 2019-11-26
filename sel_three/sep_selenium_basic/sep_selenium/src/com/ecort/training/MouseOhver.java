package com.ecort.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOhver {

	public static void main(String[] args) {
       
		 System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		 driver.get("http://opensource.demo.orangehrmlive.com/");
		
		
	     driver.findElement(By.id("txtUsername")).sendKeys("admin");
	     
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
       
	      
	     driver.findElement(By.id("btnLogin")).click();
	     
	    // click on leave menu items
	     
	     driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	     
	     WebElement jobelement = driver.findElement(By.id("menu_admin_Job"));
	     
	     Actions act = new Actions(driver); 
	     
	     act.moveToElement(jobelement).perform();
	     
	     driver.findElement(By.id("menu_admin_workShift")).click();;

	}

}
