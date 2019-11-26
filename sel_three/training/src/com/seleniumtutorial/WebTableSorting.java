package com.seleniumtutorial;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.is;

public class WebTableSorting {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
        driver = new FirefoxDriver();
        
        driver.get("http://the-internet.herokuapp.com/tables");
        /*driver.findElement(By.cssSelector("#table1 thead tr th:nth-of-type(4)")).click();

        List<WebElement> dues = driver.findElements(By.cssSelector("#table1 tbody tr td:nth-of-type(4)"));
        List<Double> dueValues = new LinkedList<Double>();
        for(WebElement element : dues){
        	System.out.println("type web element :" +element.getText());
            dueValues.add(Double.parseDouble(element.getText().replace("$", "")));
        }

        for(int counter = 0; counter < dueValues.size() - 1; counter++){
        	System.out.println("printing value   " +dueValues.get(counter));
      assertThat(dueValues.get(counter),is(lessThanOrEqualTo(dueValues.get(counter + 1))));
        }*/
	
	
        driver.get("http://opensource.demo.orangehrm.com/");
  	  
	     
		 Thread.sleep(10000);

         driver.findElement(By.id("txtUsername")).sendKeys("admin");
	   
	     Thread.sleep(10000);
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");
	     Thread.sleep(10000);
	     driver.findElement(By.id("btnLogin")).click();
	     Thread.sleep(10000);
	     driver.findElement(By.id("menu_admin_viewAdminModule")).click(); 
	     List<WebElement> dues = driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr//td[2]"));
	        List<Double> dueValues = new LinkedList<Double>();
	        for(WebElement element : dues){
	        	System.out.println("type web element :" +element.getText());
	            //dueValues.add(Double.parseDouble(element.getText()));
	        }
	
	}

	
	}


