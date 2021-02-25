/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author bindu
  */
public class SeleniumExample23 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Working\\WorkSpace\\SeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form");
WebElement fname=driver.findElement(By.id("firstName"));//
	fname.sendKeys("bindu");	
WebElement lname=driver.findElement(By.id("lastName"));
lname.sendKeys("Bhinder");
WebElement Email=driver.findElement(By.id("userEmail"));
Email.sendKeys("abc.gmail.com");
WebElement Gender=driver.findElement(By.xpath("//div[@id='genterWrapper']/div/div[2]/input[@id='gender-radio-2']"));
Gender.click();
WebElement Mobile=driver.findElement(By.id("userNumber"));
Mobile.sendKeys("11111111111");
WebElement DOB=driver.findElement(By.id("dateOfBirthInput"));
DOB.sendKeys("1/02/1986");
WebElement Sub=driver.findElement(By.xpath("//div[@id='subjectsWrapper']/div/div/div/div/div/div"));
Sub.sendKeys("Maths");
WebElement Hobbies=driver.findElement(By.id("hobbies-checkbox-2"));
Hobbies.click();
WebElement upload=driver.findElement(By.)




	}

}
