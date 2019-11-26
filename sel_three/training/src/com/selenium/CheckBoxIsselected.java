package com.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxIsselected {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("D:\\MyFolder\\selenium_dec_weekend\\example.html");
		WebElement un = ff.findElementByName("usrnm");
		un.sendKeys("admin");
		ff.findElementByName("pwd").sendKeys("manager");
		ff.findElementByCssSelector("input[type='submit']").click();
		ff.findElementById("reports").click();
		System.out.println(ff.findElementById("reports").isSelected());		
		//ff.findElementById("female").click();
		System.out.println(ff.findElementById("female").isSelected());
	}

}
