package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.opera.core.systems.OperaDriver;

public class WorkingwithOpera {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "E:/Study material/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.get("http://opensource.demo.orangehrmlive.com/");
	     Thread.sleep(10000);
         driver.findElement(By.id("txtUsername")).sendKeys("admin");
         Thread.sleep(10000);
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
	     Thread.sleep(10000);
	     driver.findElement(By.id("btnLogin")).click();

		//driver.close();
	}
}
