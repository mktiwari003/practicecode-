package filedownload;

import java.util.Scanner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;





public class FileDownload {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */public static String downloadPath = "D:\\seleniumdownloads";
	public static void main(String[] args) throws Exception {
		
		 /* WebDriver driver  = new FirefoxDriver();
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
		  
		  */

		   
		    
		
		   WebDriver driver  = new FirefoxDriver(FirefoxDriverProfile());
		     driver.manage().window().maximize();
		    Scanner sc=new Scanner(System.in);
		     driver.get("http://172.16.32.63/AP_FO/ImportBOMList.aspx");
		    // Screen scr = new Screen();
		   
		     sc.nextLine(); 
		     driver.findElement(By.xpath("//form[@id='WebForm1']/div[3]/div[3]/div/div/div/div[2]/ul/li[5]/a")).click();
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//a[@id='AP_Layout_wt104_block_wtMainContent_wt45']/img")).click();
	
		     
		   
			  /*  driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
			    driver.findElement(By.linkText("smilechart.xls")).click();
		     */
	}
	public static FirefoxProfile FirefoxDriverProfile() throws Exception {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 0);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		//profile.setPreference("browser.download.dir", downloadPath);
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/vnd.openxmlformats-officedocument.spreadsheetml.template,application/vnd.ms-excel.sheet.macroEnabled.12,application/vnd.ms-excel.template.macroEnabled.12,application/vnd.ms-excel.addin.macroEnabled.12,application/vnd.ms-excel.sheet.binary.macroEnabled.12,text/csv");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
"application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/vnd.openxmlformats-officedocument.spreadsheetml.template,application/vnd.ms-excel.sheet.macroEnabled.12,application/vnd.ms-excel.template.macroEnabled.12,application/vnd.ms-excel.addin.macroEnabled.12,application/vnd.ms-excel.sheet.binary.macroEnabled.12,text/csv");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		return profile;
	}
}
