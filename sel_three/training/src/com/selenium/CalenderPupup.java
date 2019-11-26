package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CalenderPupup {

	/**
	 * @param args
	 */
	@Test
	public void main1() {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Study material\\chromedriver.exe");
		
		ChromeDriver ff = new ChromeDriver();
		//WebDriver ff = new FirefoxDriver();
		ff.get("http://www.yatra.com/");
		ff.findElement(By.id("BE_flight_depart_date")).click();
		ff.quit();
		
		
	}

}
