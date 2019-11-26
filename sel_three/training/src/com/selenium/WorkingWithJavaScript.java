package com.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithJavaScript {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		/*
		ff.get("http://www.railtourismindia.com/cgi-bin/hotel.dll/irctc/services/home.do?BV_SessionID=@@@@2133169332.1357445005@@@@&BV_EngineID=cccfadfikhefmmicefecehidfgkdfhg.0");
		JavascriptExecutor js = (JavascriptExecutor) ff;
		//executing an existing js function
		js.executeScript("mopen('m5')");
		*/
		//executing custom js code snippet
		ff.get("https://www.irctc.co.in/");
		JavascriptExecutor js = (JavascriptExecutor) ff;
		String snippet = "document.getElementById('button').click();";
		js.executeScript(snippet);

	}

}
