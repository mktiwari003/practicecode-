package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testign_Imeans {

	
	public static void main(String[] args) {
		
     WebDriver  driver  = new  FirefoxDriver();
     
     driver.get("https://www.facebook.com/");
     
     driver.findElement(By.id("email")).sendKeys("testing");
	}

}
