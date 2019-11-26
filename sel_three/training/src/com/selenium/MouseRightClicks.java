package com.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClicks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.railtourismindia.com/cgi-bin/hotel.dll/irctc/services/home.do?BV_SessionID=@@@@0959789153.1357441145@@@@&BV_EngineID=cccfadfikhefmmicefecehidfgkdfhg.0");
		Actions act = new Actions(ff);
		WebElement parentMenu = ff.findElementByLinkText("Tourist Trains");
		act.contextClick(parentMenu).perform();
	}

}
