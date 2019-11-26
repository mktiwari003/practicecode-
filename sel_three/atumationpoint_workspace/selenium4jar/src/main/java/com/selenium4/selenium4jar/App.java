package com.selenium4.selenium4jar;

    



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println( "Hello World!" );
        
       // System.setProperty("webdriver.chrome.driver", "D:\\software\\browser\\chromedriver_win32\\chromedriver.exe");
        		
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
        	WebDriver driver = new ChromeDriver();
        	
        	driver.get("https://automationbookstore.dev/");
        	
        	
       // System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("li").above(By.id("pid2"))).getAttribute("id"));
                
        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("li").below(By.id("pid2"))).getAttribute("id"));
        		   
        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("li").toLeftOf(By.id("pid2"))).getAttribute("id"));
        
        System.out.println("relative locator value: " +driver.findElement(RelativeLocator.withTagName("li").toRightOf(By.id("pid2"))).getAttribute("id"));
          
    }

    
    
    
    
	
	}

