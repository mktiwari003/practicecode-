package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggetion {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://www.air.irctc.co.in/IndianRailways/");
		Thread.sleep(1000);
		//ff.findElement(By.xpath("//a[text()='Flights']")).click();
		ff.findElement(By.id("origin")).sendKeys("Bhopal");
		Thread.sleep(1000);
		ff.findElement(By.xpath("//a[contains(text(),'Bhopal')]")).click();
		
		
	}

}
