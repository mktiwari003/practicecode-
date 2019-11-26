package filedownload;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Filedownliad2 {

	WebDriver driver; 
	@BeforeTest 
	public void StartBrowser() { 
		//Create object of FirefoxProfile in built class to access Its properties. 
		FirefoxProfile fprofile = new FirefoxProfile(); 
		//Set Location to store files after downloading. 
		fprofile.setPreference("browser.download.dir", "D:\\WebDriverdownloads"); 
		fprofile.setPreference("browser.download.folderList", 2);
		//Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types. 
		fprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"
				 + "application/pdf;" + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;"  + "text/plain;" + "text/csv"); 
		fprofile.setPreference( "browser.download.manager.showWhenStarting", false ); 
		fprofile.setPreference( "pdfjs.disabled", true ); 
		//Pass fprofile parameter In webdriver to use preferences to download 
		 driver = new FirefoxDriver(fprofile); } 
	

@Test 
public void OpenURL() throws InterruptedException{ 
	//  WebDriver driver  = new FirefoxDriver(FirefoxDriverProfile());
	
	
	
	
	
	 driver.get("http://172.16.32.34/FCBUI/NoPermission.aspx");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[contains(@id,'UserNameInput')]")).sendKeys("system");
	    driver.findElement(By.xpath("//input[contains(@id,'wtPasswordInput')]")).sendKeys("123456Cc");
	    driver.findElement(By.xpath("//input[contains(@id,'wtLoginButton')]")).click();
	    driver.findElement(By.xpath("//span [contains (text(),'Billing Building Blocks')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a [text()='Invoices']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	    Thread.sleep(5000);
	    
	    //Down Load PDF
	    //driver.findElement(By.xpath("//table[contains(@id,'InvoiceTable')]//tr[1]//td[2]/a[2]")).click();
	    //Thread.sleep(5000);
	    
	    //Export data
	    driver.findElement(By.xpath("//a[contains(@id,'lnkExport')]")).click();
	    Thread.sleep(5000);
	    driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[contains(@id,'FileName_Input')]")).sendKeys("FCBFile01");
	    Thread.sleep(3000);
	    new Select(driver.findElement(By.xpath("//select[contains(@id,'export_combo')]"))).selectByVisibleText("XLS");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[contains(@class,'ThemeGrid_MarginGutter')]/a")).click();
	    Thread.sleep(5000);

	     
}

@AfterTest 
public void CloseBrowser() { 
	//driver.quit(); 
	} 
}