package com.ecort.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedCheckBox {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		
	     driver.findElement(By.id("txtUsername")).sendKeys("admin");
	     
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
       
	      
	     driver.findElement(By.id("btnLogin")).click();
	     
	     
	     driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']/b")).click();
	     
	     if(driver.findElement(By.id("leaveList_chkSearchFilter_2")).isSelected()== false ){
	    	 
	    	 driver.findElement(By.id("leaveList_chkSearchFilter_2")).click();
	     }

	}

}
