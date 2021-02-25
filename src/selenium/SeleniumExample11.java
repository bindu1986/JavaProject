package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample11 {
//package step.com.test.seleniumexamples;

	
	//import java.util.Set;
	 
	//import org.openqa.selenium.firefox.FirefoxDriver;
	 
	 
			public static WebDriver driver;
	 
			public static void main(String[] args) {
	 
				// Create a new instance of the Chrome driver
	 
				System.setProperty("webdriver.chrome.driver", "C:\\Working\\Workspace\\SeleniumProject\\chromedriver.exe");
		        driver = new ChromeDriver();
		        
		        //Setting the maximum amount for page load
		        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);//pageLOadTimeout is for web page.
	 
		        // Put an Implicit wait, this means that any search for elements on the page 
		      //  could take the time the implicit wait is set for before throwing exception.
	 
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait is for web elements.
	 
		        // Launch the URL
	 
		        driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	 
		        // Click on the Button "Alert Box"
		        
		        driver.findElement(By.xpath("//div[@class='element-group'][3]/span/div/div"));
		        
		        driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[2]")).click();
	 
		        driver.findElement(By.id("confirmButton")).click();
	 
		        // Switch to JavaScript Alert window
	 
		        Alert myAlert = driver.switchTo().alert();//alert class in selenium is used to handle alerts in 
		        //selenium.re
	 
		        // Accept the Alert
	 
		        try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        System.out.println(myAlert.getText());
		        
		        myAlert.accept();
		        //myAlert.dismiss();
		         
		        
		        // Close Original window
	 
		        //driver.quit();
	 
			}}
	 
	





