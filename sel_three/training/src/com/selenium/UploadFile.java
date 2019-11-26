package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	/**
	 * @param args
	 * @throws AWTException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws AWTException, IOException {
		WebDriver  driver  = new  FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
		 
		 
		 driver.get("http://s000.tinyupload.com/index.php?PHPSESSID=ksqmq7g88ioahgb5pucvp8s207");
		 
		// driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\MTiwari\\Desktop\\pheonixload\\data\\reject.txt");
		 
		 driver.findElement(By.name("uploaded_file")).click();
		 
		//Call AutoIt code
		 
		 //first way
		 
		Process procss = new ProcessBuilder(System.getProperty("user.dir")+"\\src\\uploadfile.exe","","open").start(); 
		 
		 
		 
		 new ProcessBuilder(System.getProperty("user.dir")+"\\src\\uploadfile.exe","","open").start(); 
		 
		 // 2nd  way
		 
		
		 Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
		 
		 
		 /* StringSelection ss  = new StringSelection("C:\\Users\\MTiwari\\Desktop\\pheonixload\\data\\reject.txt");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 
		 Robot rb = new Robot();
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 rb.keyRelease(KeyEvent.VK_V);
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
*/
	}

}
