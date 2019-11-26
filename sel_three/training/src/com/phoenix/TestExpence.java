package com.phoenix;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.opera.core.systems.internal.input.KeyEvent;

public class TestExpence {

	
	public  void testing() throws InterruptedException, AWTException {
		 WebDriver driver = new FirefoxDriver();  
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS );
			//login with customer user to search hold status order.
			driver.get("http://172.16.32.28/login/loginsi.aspx");
			Thread.sleep(5000);
			driver.findElement(By.id("wt27_wtMainContent_wtUserNameInput")).sendKeys("demoadmin@netlink.com");
			//driver.findElement(By.id("wt27_wtMainContent_wtUserNameInput")).click();
			driver.findElement(By.id("wt27_wtMainContent_wtinputpassword")).sendKeys("welcome1");
			driver.findElement(By.id("wt27_wtMainContent_wtlogin2")).click();
			 Thread.sleep(4000);
			 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[span[text()='Timesheets']]")));
		
			driver.findElement(By.xpath("//a[span[text()='Timesheets']]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[span[text()='Enter Expense']]")).click();
			Thread.sleep(4000);
			new Select(driver.findElement(By.xpath("//select[contains(@id,'Expense_SupplierID')]"))).selectByVisibleText("SMKSUPADM56320");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@value='Create Expense']")).click();
			Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[contains(@id,'_Expense_DATE')]")).sendKeys("2016-02-21"); 
	        Thread.sleep(4000);
	        new Select(driver.findElement(By.xpath("//select[contains(@id,'ExpensePO')]"))).selectByVisibleText("00-129423");
	        Thread.sleep(6000);
	        new Select(driver.findElement(By.xpath("//select[contains(@id,'ExpenseTypeList')]"))).selectByVisibleText("FOOD");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[contains(@id,'ExpenseAmount')]")).sendKeys("10");
	        Thread.sleep(4000);
	        new Select(driver.findElement(By.xpath("//table[contains(@id,'ExpenseHoursTableRecords')]//tbody//tr//td[5]//select"))).selectByVisibleText("GBP");
	        Thread.sleep(4000);
	        new Select(driver.findElement(By.xpath("//select[contains(@id,'ExpenseAccountCode')]"))).selectByVisibleText("SMOKEGL40366");
	        driver.findElement(By.xpath("//input[contains(@id,'ExpenseProjectName')]")).sendKeys("SxK8T22849");
	      /*  Thread.sleep(4000);
	        Keyboard kb = ((RemoteWebDriver) driver).getKeyboard();kb.pressKey(Keys.TAB);
	        kb.pressKey(Keys.TAB);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[contains(@id,'Upload')]")).click();
	        WebElement ele = driver.findElement(By.xpath("html/body/div[2]/div[2]/iframe"));
	        driver.switchTo().frame(ele);
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[contains(@id,'Upload1')]")).click();
	        Thread.sleep(4000);
	        StringSelection ss=new StringSelection("D:\\eticketing_printTicket.pdf");//Give the file path
	        driver.wait(8000);
	           java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	           Thread.sleep(4000);
	        Robot robot=new Robot();
	        robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	        robot.keyPress(java.awt.event.KeyEvent.VK_V);
	        robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	        robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	        robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	        robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@value='Save']")).click();
	        		*/
	     for(int i =  1 ; i<= 10 ; i++){
			driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[1]/span/table/tbody/tr[i]/td[13]/div/div/a/span")).click();
	        Thread.sleep(4000);
	     /*   driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div[4]/div/div/div[1]/span/table/tbody/tr[i+1]/td[10]/div/a")).click();
	        WebElement ele1 = driver.findElement(By.xpath("html/body/div[2]/div[2]/iframe"));
	        driver.switchTo().frame(ele);
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[contains(@id,'Upload1')]")).click();
	        Thread.sleep(4000);
	        StringSelection ss1=new StringSelection("D:\\TestLog.xlsx");//Give the file path
	        driver.wait(8000);
	           java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	           Thread.sleep(4000);
	        Robot robot1=new Robot();
	        robot1.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	        robot1.keyPress(java.awt.event.KeyEvent.VK_V);
	        robot1.keyRelease(java.awt.event.KeyEvent.VK_V);
	        robot1.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	        robot1.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	        robot1.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//input[@value='Save']")).click();*/
	     }
			
			
	     driver.findElement(By.xpath("//div[contains(@id,'widgetbodycenter')]//div[6]//input[1]")).click();
	        
	 	
            
	
	
	}

}
