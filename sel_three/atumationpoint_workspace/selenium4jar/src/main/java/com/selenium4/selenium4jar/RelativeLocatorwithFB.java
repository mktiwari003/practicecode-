package com.selenium4.selenium4jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorwithFB {

	 public static void main( String[] args )
	    {
	       
	        
	       // System.setProperty("webdriver.chrome.driver", "D:\\software\\browser\\chromedriver_win32\\chromedriver.exe");
	        		
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        	
	        //	driver.get("https://jqueryui.com/themeroller/");
	        	
	        
	        driver.get("https://www.facebook.com/");
	        	
	        	
	        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.id("email"))).getAttribute("id"));
		          
	        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("input").toLeftOf(By.id("pass")).below(By.xpath("//label[contains(text(),'Email or Phone')]"))).getAttribute("id"));	
	        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("input").toLeftOf(By.id("pass")).below(By.xpath("//label[contains(text(),'Email or Phone')]"))).getLocation());	
	        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("input").toLeftOf(By.id("pass"))).getAttribute("id"));
	        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("input").toLeftOf(By.id("pass"))).getLocation());
	        
	        System.out.println("relative locator below value: " +driver.findElement(RelativeLocator.withTagName("a").below(By.id("loginbutton"))).getAttribute("href"));
	        System.out.println("relative locator below value: " +driver.findElement(RelativeLocator.withTagName("a").below(By.id("loginbutton"))).getText());
	        System.out.println("relative locator below value: " +driver.findElement(RelativeLocator.withTagName("a").below(By.id("loginbutton"))).getLocation());
	        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("input").above(By.xpath("//a[contains(text(),'Forgotten account?')]")).toRightOf(By.id("email"))).getAttribute("id"));
	        
	        
	        WebElement elment =  driver.findElement(RelativeLocator.withTagName("tagName").above(By.id("id")).toRightOf(By.id("email")));
	        
	        // System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("li").above(By.id("pid2"))).getAttribute("id"));
	                
	       // System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("td").above(By.xpath("//td/a[text()='17']")).toLeftOf(By.xpath("//td/a[text()='9']"))).getAttribute("class"));
	        		   
	       // System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("a").toLeftOf(By.xpath("//a[contains(text(),'Facebook Lite')]"))).getText());
	        
	        //System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("a").toRightOf(By.xpath("//a[contains(text(),'Facebook Lite')]"))).getText());
	          
	    }


}