package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumExample12 {
 
	 
			public static WebDriver driver;
	 
			public static void main(String[] args) throws InterruptedException {
	 
				// Create a new instance of the Chrome driver
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
				DesiredCapabilities dCapab = DesiredCapabilities.chrome();
				//options.setExperimentalOption("useAutomationExtension", false); 
				//options.isJavascriptEnabled()
				options.addArguments("disable-extensions");
				options.addArguments("disable-infobars");
				options.addArguments("start-maximized");
				options.addArguments("--disable-popup-blocking");
				dCapab.setCapability(ChromeOptions.CAPABILITY, options);
				driver = new ChromeDriver(dCapab);
	 
		        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
		        // Launch the URL
	 
		        driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		        
                 	     
	 
		        // Store and Print the name of the First window on the console
	 
		        String parentWindow= driver.getWindowHandle();
	 
		        Thread.sleep(2000);
		        System.out.println("Parent Window : " +parentWindow); 
		        
                driver.findElement(By.xpath("//div[@class='element-group'][3]/span/div/div"));
		        
		        driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[1]")).click();
		        
		        
		        
		     // Click on the Button "New Message Window"
		        driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	 
		       
	 
		        // Store and Print the name of all the windows open	              
	 
		        Set<String> allWindows = driver.getWindowHandles();
//Set of string is return type of of getWindowHandles() method.  Return type of getWindowHandle() is String.
		        Thread.sleep(2000);
		        System.out.println("All windows open are : " +allWindows);
	 
		        // Pass a window handle to the other window
	 
		        for (String handle1 : allWindows) {
	 
		        	Thread.sleep(2000);
	 
		        	driver.switchTo().window(handle1);
		        	System.out.println(driver.getTitle());
		        }
	 
		        // Closing Pop Up window
	 
		        Thread.sleep(2000);
		        driver.close();
	 
		        // Close Original window
		        driver.switchTo().window(parentWindow);
		        Thread.sleep(2000);
		        driver.close();
		} 
	}





