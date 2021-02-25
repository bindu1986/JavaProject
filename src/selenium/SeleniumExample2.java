package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample2 {
	

	public static void main(String[] args) {
		WebElement emailId;
		WebElement password;
		WebElement login;
		System.setProperty("webdriver.chrome.driver","C:\\Working\\WorkSpace\\SeleniumProject\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com");
   emailId=driver.findElement(By.id("email"));
   emailId.sendKeys("Bindu.bhinder@mail.com");
   password=driver.findElement(By.id("pass"));
   /*
    *  sendkeys() in Selenium is a method used to 
    * enter editable content in the text and 
    * password fields during test execution. These fields are identified..
    */
   password.sendKeys("Avnit1306$");
   login=driver.findElement(By.id("u_0_b"));
   login.click();
	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
driver.quit();
	}

}
