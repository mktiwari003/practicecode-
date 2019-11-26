package com.phoenix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ExpenceDataCreation {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@Test()
	 public void main1() throws InterruptedException {
		WebDriver  driver = new FirefoxDriver();  
	    driver.get("http://172.16.32.28/login/loginsi.aspx");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS ); 
	   Thread.sleep(5000);
	   driver.findElement(By.id("wt27_wtMainContent_wtUserNameInput")).sendKeys("demoadmin@netlink.com");
	   driver.findElement(By.id("wt27_wtMainContent_wtinputpassword")).sendKeys("welcome1");
	   driver.findElement(By.id("wt27_wtMainContent_wtlogin2")).click();
	   Thread.sleep(4000);
	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[span[text()='Timesheets']]")));
	   driver.findElement(By.xpath("//a[span[text()='Timesheets']]")).click();
	   Thread.sleep(4000);
	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[span[text()='Timesheets']]")));
	   driver.findElement(By.xpath("//a[span[text()='Enter Expense']]")).click();
	   Thread.sleep(4000);
	   new Select(driver.findElement(By.xpath("//select[contains(@id,'Expense_SupplierID')]"))).selectByVisibleText("GARRRIX");
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//input[@value='Create Expense']")).click();
	   Thread.sleep(4000);
	   int n=5;
	for(int i = 1 ; i<=5; i++)
	{
	 System.out.println("Round-----------------"+i);  
	   driver.findElement(By.xpath("//table[contains(@id,'ExpenseHoursTab')]//tr["+i+"]//td[1]/input")).sendKeys("2016-02-23"); 
	   Thread.sleep(5000);
	   new Select(driver.findElement(By.xpath("//table[contains(@id,'ExpenseHoursTab')]//tr["+i+"]//td[2]/span/select"))).selectByVisibleText("00-173586");
	 Thread.sleep(5000);
	 new Select(driver.findElement(By.xpath("//table[contains(@id,'ExpenseHoursTab')]//tr["+i+"]//td[3]/div/span/select"))).selectByVisibleText("FOOD");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//table[contains(@id,'ExpenseHoursTab')]//tr["+i+"]//td[4]/div/span/input")).sendKeys("10");
	 Thread.sleep(3000);
	 new Select(driver.findElement(By.xpath("//table[contains(@id,'ExpenseHoursTab')]//tr["+i+"]//td[8]/div/span/select"))).selectByVisibleText("SMOKEGL50785");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//table[contains(@id,'ExpenseHoursTab')]//tr["+i+"]//td[9]/div/input")).sendKeys("sB3oD76580");
	 Thread.sleep(3000);
	// Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();kb.pressKey(Keys.TAB);
	// kb.pressKey(Keys.TAB);
	 Thread.sleep(3000);
	 if(i!=n)
	 {
	 driver.findElement(By.xpath("//table[contains(@id,'ExpenseHoursTab')]//tr["+i+"]//td[12]/div/a[1]/span")).click();
	 Thread.sleep(4000);
	 }
	      }

	      driver.findElement(By.xpath("//div[contains(@id,'widgetbodycenter')]//div[6]//input[1]")).click();
	      System.out.println("hit on submit button"); 
	    Thread.sleep(7000);
	      String Message=driver.findElement(By.xpath("//span[contains(@class,'Feedback_Message_Text')]")).getText();
	      System.out.println(Message); 
	 driver.quit();
	}

}
