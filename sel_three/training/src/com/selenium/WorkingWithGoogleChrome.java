package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGoogleChrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MyFolder\\selenium_dec_weekend\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://qspiders.com/webmail");


	}

}
