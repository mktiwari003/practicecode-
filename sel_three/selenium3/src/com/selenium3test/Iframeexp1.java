package com.selenium3test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframeexp1 {

	
////	WebDriver driver;
////	@Test
////	public void criccBuzz() throws InterruptedException{
////		
////		//System.setProperty("webdriver.chrome.driver","D:\\software\\selenium_standalone\\chromedriver_win32\\chromedriver.exe");
////		// driver = new ChromeDriver();
////		 
////		 System.setProperty("webdriver.gecko.driver", "D:\\software\\selenium_standalone\\geckodriver-v0.15.0-win64\\geckodriver.exe");
////			WebDriver driver = new FirefoxDriver();
////		 
////		driver.get("http://timesofindia.indiatimes.com/");
////		
////		/*
////		Scanner sc = new Scanner(System.in);
////		sc.nextLine();
////		*/
////		
////		/*
////		WebElement web1 = driver.findElement(By.xpath("//div[@id='popular-widget']/iframe"));
////		driver.switchTo().frame(web1);
////		List<WebElement> polllistclick = driver.findElements(By.xpath("//span[@id='dotsblk']//li/a"));
////		
////		List<WebElement> polllist = driver.findElements(By.xpath("//div[@id='homePicGallery']//li/a"));
////		
////		polllistclick.get(1).click();
////		polllist.get(1).click();
////		
////		
////		System.out.println(isElementVisible(By.xpath("//span[@id='dotsblk']//li[9]/a")));
////		driver.findElement(By.xpath("//span[@id='dotsblk']//li[9]/a")).click();
////		//driver.findElement(By.xpath("//div[@id='homePicGallery']//li[10]/a")).click();
////		*/
////		
////		//Once control is switched to a frame. then to switch to the default content to interact 
////		//with the element of default page 
////		
////		
////		//Scroll element to make it visible
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////		WebElement element = driver.findElement(By.xpath("//a[text()='Navbharat Times']"));
////		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
////		Thread.sleep(500);
////		
////		
////		/*WebElement element = driver.findElement(By.xpath("//a[text()='Navbharat Times']"));
////		Actions actions = new Actions(driver);
////		actions.moveToElement(element);
////		actions.perform();
////		*/
////		
////		
////		//1. Switch to specific frame 
////		WebElement web1 = driver.findElement(By.xpath("//div[@id='popular-widget']/iframe"));
////		driver.switchTo().frame(web1);
////		//driver.findElement(By.xpath("//span[@id='dotsblk']//li[9]/a")).click();
////		
////		//Iframeexp1 el = new Iframeexp1();
////		//WebElement wb = el.getWhenVisible(By.xpath("//div[@id='homePicGallery']//li[1]/a/img"), 120);
////		WebDriverWait wait = new WebDriverWait(driver, 120);
////	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='homePicGallery']//li[1]/a/img")));
////		driver.findElement(By.xpath("//div[@id='homePicGallery']//li[1]/a/img")).click();
////        
////		
////		
////		
////		
////		driver.switchTo().defaultContent();
////		
////		//2. Interact with parent page element 
////		//System.out.println(driver.findElement(By.xpath("//div[text()='FROM ACROSS THE TIMES OF INDIA']")).getText());
////		//System.out.println(isElementVisible(By.xpath("//a[text()='Mumbai Mirror ']")));
////		driver.findElement(By.xpath("//a[text()='Mumbai Mirror ']")).click();
//		
//	
//	}	   
//	
//	
//	
//	
//	public boolean isElementVisible(By by) {
//	    try {
//	        if (driver.findElement(by).isDisplayed()) {
//	            
//	            return true;
//	        }
//	    }
//	    catch(Exception e) {       
//	        
//	        return false;
//	    }       
//
//	    return false;
//	}
//	
//	
//	public WebElement getWhenVisible(By locator, int timeout) {
//		WebElement element = null;
//		WebDriverWait wait = new WebDriverWait(driver, timeout);
//		    element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		return element;
//		}
//	
}
