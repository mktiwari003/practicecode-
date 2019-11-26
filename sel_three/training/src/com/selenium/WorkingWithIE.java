package com.selenium;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.ie.InternetExplorerDriver;

public class WorkingWithIE {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "D:\\MyFolder\\selenium_dec_weekend\\IEDriverServer.exe");
		InternetExplorerDriver ff = new InternetExplorerDriver();
		ff.get("https://www.irctc.co.in/");
		ff.findElementByLinkText("Hotels").click();
		System.out.println("-------After clicking on Hotels-----");
		//Thread.sleep(10000);
		Set<String> windowHandles = ff.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		System.out.println(windowHandles.size());
		String parent = it.next();
		String child = it.next();		
		System.out.println(parent);
		System.out.println(child);
		ff.switchTo().window(child);
		
		Thread.sleep(5000);
		ff.findElementByXPath("//img[@src='/hotel/Media/images/ginger_banner.jpg']").click();
		System.out.println("---------After clicking on Ginger------");
		Set<String> allWindowHandles = ff.getWindowHandles();
		Iterator<String> it1 = allWindowHandles.iterator();
		parent = it1.next();
		child = it1.next();
		String gc = it1.next();		
		System.out.println(parent);
		System.out.println(child);
		System.out.println(gc);
		ff.switchTo().window(gc);
		Thread.sleep(5000);
		ff.findElementByLinkText("Login").click();
		ff.close();
		Thread.sleep(5000);
		ff.switchTo().window(child);
		ff.close();
		ff.switchTo().window(parent);
		ff.close();

	}

}
