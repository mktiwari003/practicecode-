package com.selenium.tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drowdown {

	public static void main(String[] args) {

		  System.setProperty("webdriver.chrome.driver", "D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
		  
		     
		      
		      ChromeDriver driver = new ChromeDriver();
		     // driver.get("https://www.facebook.com");
		      driver.navigate().to("https://www.facebook.com");
		     WebElement montdd = driver.findElement(By.xpath("//select[@id='month']"));
		      montdd.sendKeys("Nov");
		      
		     List<WebElement>  monthOption = montdd.findElements(By.tagName("option"));
		     System.out.println(monthOption.size());
		     
		     for(int i = 0 ; i<= monthOption.size()-1; i++){
		    	 
		    	 System.out.println(monthOption.get(i).getText()+" "+monthOption.get(i).isSelected());
		     }
		    
		    
		    
		    
	}

}
