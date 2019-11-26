package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://172.16.32.28/login/loginsi.aspx");
		ff.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ff.findElementById("wt27_wtMainContent_wtUserNameInput").sendKeys("demoadmin@netlink.com");
		ff.findElementById("wt27_wtMainContent_wtinputpassword").sendKeys("welcome1");
		ff.findElementById("wt27_wtMainContent_wtlogin2").click();
		ff.findElementByXPath("//span[text()='Logout']").click();
		
	}

}
