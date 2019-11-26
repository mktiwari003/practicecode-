package com.adselenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltips {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver ff = new FirefoxDriver();
		/*
		ff.get("http://www.flipkart.com/");
		//getting tooltip present as title/alt property of the element 
		System.out.println(ff.findElementByXPath("//a[@href='/best-of-2012-bmv-l?icmpid=Dec53i&otracker=hp_new_on_fk']").getAttribute("title"));
		*/
		//Tooltips which are hidden div popups
		ff.get("http://www.koovs.com/shirts");
		Thread.sleep(5000);
		System.out.println(ff.findElementByXPath("//div[@class='prodBox prodBox_4'][1]/descendant::span[@class='sizeMeasurement']").getText());
	}
	

}
