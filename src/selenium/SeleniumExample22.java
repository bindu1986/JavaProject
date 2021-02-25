package selenium;

//public class SeleniumExample22 {


	
	import java.util.HashMap;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class SeleniumExample22 {
		
		public static void main(String args[]){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			String downloadFilepath = "C:\\Working\\Workspace\\SeleniumProject\\Results\\";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadFilepath);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);  
			options.addArguments("--test-type");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			WebDriver driver = new ChromeDriver(cap);
			
			driver.get("http://www.seleniumhq.org/download/");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.linkText("32 bit Windows IE")).click();
			
		}

	}




