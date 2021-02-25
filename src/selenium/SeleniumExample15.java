package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample15 {

	public static void main(String[] args) {
		/*
		 * Practice Exercise 1

			Launch new Browser
			Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
			Get the value from cell ‘Dubai’ and print it on the console
			Click on the link ‘Detail’ of the first row and last column
		 */
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
			
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	        driver.get("http://toolsqa.com/automation-practice-table");
			
			//Here we are storing the value from the cell in to the string variable
			String sCellValue = driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr/td[2]")).getText();
			System.out.println(sCellValue);
			
			// Here we are clicking on the link of first row and the last column
			driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
			System.out.println("Link has been clicked otherwise an exception would have thrown");
			driver.close();
		}
	



		// TODO Auto-generated method stub

	}


