package com.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDD {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("");
		WebElement menu = ff.findElementByName("");
		Select dd = new Select(menu);
		Thread.sleep(2000);
		dd.selectByIndex(2);
		Thread.sleep(2000);
		dd.selectByValue("");
		Thread.sleep(2000);
		dd.selectByVisibleText("");
		
		WebElement fso = dd.getFirstSelectedOption();
		System.out.println(fso.getText());
		
		//multi select list box
		WebElement menuMultiple = ff.findElementByName("");
		Select ddMulti = new Select(menuMultiple);
		ddMulti.selectByIndex(2);
		ddMulti.selectByValue("");
		ddMulti.selectByVisibleText("");
		
		fso = ddMulti.getFirstSelectedOption();
		System.out.println(fso.getText());
		
		List<WebElement> allSelectedOptions = ddMulti.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());
		for(int i=0;i<allSelectedOptions.size();i++){
			/*
			WebElement opt = allSelectedOptions.get(i);
			opt.getText();
			*/
			System.out.println(allSelectedOptions.get(i).getText());
		}
		
		//Thread.sleep(2000);
		//ddMulti.deselectAll();
		System.out.println("------------------------------");
		List<WebElement> allOpts = ddMulti.getOptions();
		for(int j=0;j<allOpts.size();j++){
			System.out.println(allOpts.get(j).getText());
		}
		

	}

}
