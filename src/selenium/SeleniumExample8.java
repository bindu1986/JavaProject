package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample8 {
	/*
	* This example demonstrates the Javascript functionality to 	 scrolldown a webpage
	 * JavaScript can be used in following cases
	 * 1. Scroll up and down a web page
	 * 2. Click on a WebElement
	 * 3. Hover over on a WebElement
	 * 4. Check if there are any active ajax calls pending (Ajax calls made by jQuery, AngularJs, ExtJs) 
	 
     * Executed the JavaScript using Selenium Webdriver.
     * Illustrated how to click on an element through JavaScriptExecutor, if selenium fails 
     * to click on element due to some issue.(disabled web element)
     * Generated the 'Alert' window using JavaScriptExecutor.
     * Navigated to the different page using JavaScriptExecutor.
     * Scrolled down the window using JavaScriptExecutor.
     * Fetched URL, title, and domain name using JavaScriptExecutor.
     * javaScriptExecuter is also used to highlight an element during execution of a test case.
     */


		public static void main(String[] args) {		
			//WebDriver d= new FirefoxDriver();
			//EventFiringWebDriver driver = new EventFiringWebDriver(d);
			
			System.setProperty("webdriver.chrome.driver", "C:\\Working\\Workspace\\SeleniumProject\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
			//Scroll down by specifying the scroll position
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			//jse.executeScript("window.scrollBy(0,100)", "");
			
			//Scroll down to make the WebElement into view
			WebElement element = driver.findElement(By.linkText("Facebook Lite"));
			jse.executeScript("arguments[0].scrollIntoView(true);",element);		 
		}
	}





