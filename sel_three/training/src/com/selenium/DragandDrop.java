package com.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Actions act = new Actions(ff);
		WebElement source = ff.findElementByXPath("//div[@id='block-1']/h1");
		WebElement target = ff.findElementById("column-2");
		//With direct dragAndDrop method
		//act.dragAndDrop(source, target).perform();
		
		//without dragAndDrop method
		/*
		act.clickAndHold(source).perform();
		act.moveToElement(target).perform();
		act.release().perform();
		*/
		//building and performing composite action
		act.clickAndHold(source).moveToElement(target).release().build().perform();
	}

}
