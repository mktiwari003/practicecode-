package com.selenium3test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmlTabl {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "D:\\software\\selenium_standalone\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		*/
		System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='resultTable']//thead/tr/th"));
		
		table.get(0).click();
		
		System.out.println(table.get(2).getText());

	}

}
