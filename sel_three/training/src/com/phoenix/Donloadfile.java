package com.phoenix;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpHead;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Donloadfile {

	
	/*
	public static void main(String[] args) throws ClientProtocolException, IOException {
		        WebDriver driver = new FirefoxDriver(); 
		        driver.get("http://the-internet.herokuapp.com/download");
		        String link = driver.findElement(By.cssSelector(".example a:nth-of-type(1)")).getAttribute("href");

		        HttpClient httpClient = HttpClientUtils.create().build();
		        HttpHead request = new HttpHead(link);
		        HttpResponse response = httpClient.execute(request);
		        String contentType = response.getFirstHeader("Content-Type").getValue();
		        System.out.println(contentType);
		        int contentLength = Integer.parseInt(response.getFirstHeader("Content-Length").getValue());
		        System.out.println(contentLength);
		    // assertThat(contentType,"application/octet-stream");
		      //  assertThat(contentLength, is(not(0)));
		    }

	*/
	}


