package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample9 {
	 
	/*
	 * This example demonstrates how to enter a value in disabled textbox using JavaScript 
	 */

	 
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
			
			// This element is disable, so if we try to click on disable webelement then 
			// it will throw exception
			// Using below code it will pass the data forcefully.
	 
			JavascriptExecutor jse = (JavascriptExecutor) driver;
	 
			jse.executeScript("document.getElementById('pass').value = 'mukeshotwani';");
		}
	}





