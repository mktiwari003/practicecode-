package com.adselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosugession {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.google.co.in/");
		ff.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ff.findElementById("gbqfq").sendKeys("selenium");
		//Thread.sleep(5000);		
		ff.findElementByXPath("//table[@class='gssb_m']/descendant::b[contains(text(),'webdriver')]").click();

	}

}
