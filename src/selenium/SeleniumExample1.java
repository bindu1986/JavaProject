package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//OPENING AN EMAIL.
//This is my first change for Git Demo
//This is my secod commit from Raman"
public class SeleniumExample1 {
	public static void main(String[] args) {
		WebElement userId;//global variables- all WebElements are global variables we are using in this program. 
		WebElement next;
		WebElement password;
		WebElement signIn;
       WebElement welcomeText;

		System.setProperty("webdriver.chrome.driver", "C:\\Working\\WorkSpace\\SeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");

		 userId = driver.findElement(By.id("identifierId"));
		userId.sendKeys("demoa1001@gmail.com");

		next = driver.findElement(By.id("identifierNext"));
		next.click();

		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		       
		        welcomeText = driver.findElement(By.id("headingText"));
		        System.out.println("The welcome text is " + welcomeText.getText());
		       
		        password = driver.findElement(By.xpath("//div[@id='password']/div/div/div/input"));
		        password.sendKeys("Confidence10");
		        signIn = driver.findElement(By.id("passwordNext"));
		        signIn.click();
		       
		        try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		       
		        //driver.close();
		        driver.quit();
		}
		}





