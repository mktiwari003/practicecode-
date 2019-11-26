package com.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.gsmarena.com/nokia_lumia_920-4967.php");
	
		String xpth = "//tr[td[a[text()='GPRS']]]/td[2]";
		System.out.println(ff.findElementByXPath(xpth).getText());		
	
		
	}

}
