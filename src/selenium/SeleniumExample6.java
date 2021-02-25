package selenium;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;



public class SeleniumExample6 {
	 /*
	 * This example is to demonstrate the following
	 * Need for DesiredCapabilities and ChromeOptions
	 * Maximize a browser
	 * WebElement.findElement 
	 * Select an option from the dropdown - List<WebElement>// 
	 * Select an option from the dropdown - Select class// select class is use to select one value among others.
	 */

		WebDriver driver;

				
			
			 //ChromeOptions to disable extensions, maximize it etc
			
			
			public void setbrowserSettings(){ //user defined method#setBrowserSettings
				
//ChromeOptions is another class that can be used in conjunction with Desired Capabilities in 
//	Selenium WebDriver for Chrome to customize or manipulate the various properties of Chrome browser.//
 //ChromeOptions class helps to do particular settings
//in a web page during automation.
//Does ChromeOptions and DesiredCapabilities always come together?
	/*First we create an object of ChromeOptions i:e 'options' and then we will create an object of
	 *  DesiredCapabilities	i:e 'dCapab'and then we will pass '.wedDriver's' name to set browser settings.		
	 */
			ChromeOptions options = new ChromeOptions();
			DesiredCapabilities dCapab = DesiredCapabilities.chrome();
/*DesiredCapabilities package. It helps Selenium WebDriver set the properties for the browsers. 
 * So using different capabilities from Desired Capabilities class we can 
 * set the properties of browsers. For example, the name of the browser, 
 * the version of the browser.		
 */
			
//what does use automationExtention does?//its a pop up window that occurs during automation of a project and to close it 
			// we use this option..
			options.setExperimentalOption("useAutomationExtension", false); 
			
			options.addArguments("disable-extensions"); //options is an object of ChromeOptions.
			options.addArguments("disable-infobars");
			options.addArguments("start-maximized");
			options.addArguments("--disable-popup-blocking");
			
			//Disable password save pop up
			Map<String, Object> passwordSavePopPref = new HashMap<String, Object>();//?
			passwordSavePopPref.put("credentials_enable_service", false);
			passwordSavePopPref.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", passwordSavePopPref);
			
			dCapab.setCapability(ChromeOptions.CAPABILITY, options);//Chrome Options as Capabilities.
/*in the end we will use dCapab.setCapability method and in the arguments we will pass 
 * 	ChromeOptions.CAPABILITY, and options( object of ChromeOptions method).
 * and in the end as we have already passed our current webbrowser to the object of DesiredCapabilities
 * so we will pass dCapab to the driver.		
 */
			driver = new ChromeDriver(dCapab);
			
			}
			
			// xpath = ("//tagname[@attribute=' value of attribute']")
			
			public void signUp(){
				
			WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
			fname.sendKeys("Raman");				
			WebElement lname= driver.findElement(By.xpath("//input[@name='lastname']"));
			lname.sendKeys("Brar");
			
			WebElement remail= driver.findElement(By.xpath("//input[@name='reg_email__']"));
			remail.sendKeys("12345");
			
			//WebElement conemail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
			//conemail.sendKeys("12345");
			
			WebElement pass= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			pass.sendKeys("Raman123");
			
			WebElement days= driver.findElement(By.id("day"));
			days.click();
			
			List<WebElement> dates = days.findElements(By.tagName("option"));
			for(WebElement element: dates){
				if(element.getText().contentEquals("8")){
					element.click();
					break;
				}
	
			/*Select s1 = new Select(days);
			s1.selectByIndex(10);*/
			//days.click();
			
			WebElement Months= driver.findElement(By.id("month"));
			Select s2  = new Select(Months);
			s2.selectByIndex(4);
			//s2.selectByValue("Mar");
			
			WebElement TotalYears= driver.findElement(By.id("year"));
			Select s3 = new Select(TotalYears);
			s3.selectByIndex(4);		
			
			List<WebElement> RadioButton= driver.findElements(By.name("sex"));
			RadioButton.get(0).click();
			
			WebElement SubmitButton = driver.findElement(By.name("websubmit"));
			SubmitButton.click();
			
			//WebElement ErrorText = driver.findElement(By.xpath("//div[contains(@class,'_5633')]"));
			//System.out.println(ErrorText.getText());
		}
				
			}
			
			
	
	
	    public void testcase2(){
	    	
	    	System.setProperty("webdriver.chrome.driver", "C:\\Working\\Workspace\\SeleniumProject\\chromedriver.exe");
	    	     	 
	    	 setbrowserSettings();
	    	 
	    	 driver.get("https://www.facebook.com/r.php");
	    	 
	    	signUp();
	    }
	
	    public static void main(String[] args) {
	    	
	    	SeleniumExample6 obj6 = new SeleniumExample6();
	    	obj6.testcase2();
	    	
	    }
	}





