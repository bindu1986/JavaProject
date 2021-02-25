package selenium;

import java.io.File;
import java.io.IOException;
//+import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
/*
	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;

*/

public class SeleniumExample18 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities dCapab = DesiredCapabilities.chrome();
		options.setExperimentalOption("useAutomationExtension", false); 
		options.addArguments("disable-extensions");
		options.addArguments("disable-infobars");
		options.addArguments("start-maximized");
		options.addArguments("--disable-popup-blocking");
		dCapab.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver = new ChromeDriver(dCapab);
		
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		
		takeScreenshot(driver);
		
	}

	public static void takeScreenshot(WebDriver driver){//takeScreenshot is a class for taking screenshot if  
		                                  //program breaks due to any coding error as a proof.             
		                                //takeScreenshot(WebDriver args) in args we will assign driver because 
		                              //this class will work for the whole screen and not for any particular 
		//web element.
		/*TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		 * File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 * FileHandler is a new Class in Selenium which help us the to store screenshots, create directory and so on. 
		  */
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scrFile, new File("C:\\Working\\Workspace\\SeleniumProject\\Results\\screenshot1.png"));
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}



