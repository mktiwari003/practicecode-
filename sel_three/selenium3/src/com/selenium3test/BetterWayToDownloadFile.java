package com.selenium3test;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BetterWayToDownloadFile {
	
	
	
	WebDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
    	
    	System.setProperty("webdriver.gecko.driver", "D:\\software\\selenium_standalone\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		
    driver = new FirefoxDriver();
    }
    
    @Test
    public void downloadFileRevisitedTest() throws Exception {
        driver.get("http://the-internet.herokuapp.com/download");
        String link = driver.findElement(By.cssSelector(".example a:nth-of-type(1)")).getAttribute("href");

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpHead request = new HttpHead(link);
        HttpResponse response = httpClient.execute(request);
        String contentType = response.getFirstHeader("Content-Type").getValue();
        int contentLength = Integer.parseInt(response.getFirstHeader("Content-Length").getValue());

       // assertThat(contentType, is("application/octet-stream"));
       // assertThat(contentLength, is(not(0)));
    }



    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

}
