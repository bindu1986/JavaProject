package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample4 {
	public static void main(String[] args) {
	WebElement Youtube;
	System.setProperty("webdriver.chrome.driver","C:\\Working\\WorkSpace\\SeleniumProject\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/watch?v=ybBTLU3zmrs");
	 Youtube=driver.findElement(By.id("removeButton"));
	try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	driver.quit();
		}
		 
	}

	
	

