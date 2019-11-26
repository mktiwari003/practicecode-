package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Somechallenges {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver ff = new FirefoxDriver();
		//maximize browser
		ff.manage().window().maximize();
		//ff.get("http://seleniumhq.org/");
		ff.navigate().to("http://seleniumhq.org/");
		
		ff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		ff.findElementByLinkText("Download").click();
		Thread.sleep(3000);
		System.out.println(ff.getCurrentUrl());
		System.out.println(ff.getTitle());
		
		ff.navigate().back();
		Thread.sleep(3000);
		System.out.println(ff.getCurrentUrl());
		ff.navigate().forward();
		Thread.sleep(3000);
		ff.navigate().refresh();

	}

}
