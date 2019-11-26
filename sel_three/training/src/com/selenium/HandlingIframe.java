package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingIframe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://timesofindia.indiatimes.com/");
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//switch to frame using id/name = String arg
		ff.switchTo().frame("pollframe");
		ff.findElementById("mathuserans2").sendKeys("9");
		
		
		ff.switchTo().defaultContent();
		
		//switch to frame using WebElement arg
		WebElement frm = ff.findElementByXPath("//iframe[@src='http://timesofindia.indiatimes.com/configspace/ads/TOIHP_Right.html']");
		ff.switchTo().frame(frm);
		ff.findElementByXPath("//tr[1]/td[1]/a").click();

	}

}
