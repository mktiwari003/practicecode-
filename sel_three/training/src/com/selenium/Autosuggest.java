package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Autosuggest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.google.co.in/");
		ff.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ff.findElementById("lst-ib").sendKeys("selenium");
		//Thread.sleep(5000);		
		ff.findElementByXPath("//div[@class='gstl_0 sbdd_a']/descendant::b[contains(text(),'webdriver')]").click();

}

	@Test()
public	void test(){
	
	
}
}
