package com.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.koovs.com/shirts");
		Thread.sleep(5000);
		System.out.println(ff.findElementByXPath("//div[@class='prodBox prodBox_4'][1]/descendant::span[@class='sizeMeasurement']").getText());

	}

}
