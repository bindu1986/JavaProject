package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample7 {
	/*
	 * This example demonstrates how to select date from a calendar
	 */

	 
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Working\\Workspace\\SeleniumProject\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	 
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			driver.findElement(By.id("datepicker")).click();
			
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			for(WebElement ele:allDates){			
				String date=ele.getText();
				if(date.equalsIgnoreCase("17")){//what is equalsIgnoreCase??
					/*The equalsIgnoreCase() method compares two strings irrespective of the case (lower or upper)
					 *  of the string. 
					 * This method returns true if the argument is not null 
					 * and it represents an equivalent String ignoring case, else false. 
					 */
					ele.click();
					break;
				}
			}
		}
	}





