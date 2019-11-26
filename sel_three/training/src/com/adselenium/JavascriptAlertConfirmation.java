package com.adselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptAlertConfirmation {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://demo.actitime.com/project/customeradd.do?resetForm=true");
		ff.findElementByName("username").sendKeys("admin");
		ff.findElementByName("pwd").sendKeys("manager");
		ff.findElementById("loginButton").click();
		Thread.sleep(10000);				
		ff.findElementByName("name").sendKeys("asdf");
		ff.findElementByXPath("//input[@onclick='cancelCustomerCreation();']").click();
		Alert alrt = ff.switchTo().alert();
		Thread.sleep(1000);
		//print the alert/confirmation text
		System.out.println(alrt.getText());
		//click on cancel
		//alrt.dismiss();
		
		//click on ok
		alrt.accept();
	}

}
