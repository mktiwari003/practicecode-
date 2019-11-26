package com.netlink;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  WebDriver wd = new FirefoxDriver();
		  wd.get("https://www.google.com/intl/en/mail/help/about.html");
		  wd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  wd.manage().window().maximize();
		  System.out.println(wd.getCurrentUrl());
		  System.out.println(wd.getTitle());
		  wd.findElement(By.id("gmail-sign-in")).click();
		  wd.findElement(By.id("Email")).sendKeys("testing");
	}

}
