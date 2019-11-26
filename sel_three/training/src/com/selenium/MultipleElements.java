package com.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("");
		//count number of links
		List<WebElement> allLinks= ff.findElementsByTagName("");
		System.out.println(allLinks.size());
		for(int i=0;i<allLinks.size();i++){
			//print the text of all the links
			//System.out.println(allLinks.get(i).getText());
			//print any attribute of the element
			System.out.println(allLinks.get(i).getAttribute(""));
		}
		
		List<WebElement> allChkBoxes = ff.findElementsByXPath("");
		System.out.println(allChkBoxes.size());
		for(int i=0;i<allChkBoxes.size();i++){
			//check all checkboxes
			allChkBoxes.get(i).click();
		}

	}

}
