package selenium;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumExample14 {
	public static void main(String args[]) throws AWTException, InterruptedException{
		
		// Start browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	 
		// maximize browser
		//driver.manage().window().maximize();
		//driver.get("http://my.monsterindia.com/create_account.html");
		driver.get("https://www.monsterindia.com/seeker/personal");
		Thread.sleep(2000);
		
		// Specify the file location with extension
		StringSelection sel = new StringSelection("C:\\Working\\Workspace\\SeleniumProject\\InputFiles\\Resume.doc");
	    // String name = "Raman";
		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
	 
		// Open Monster.com
		
	 
		// This will scroll down the page 
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("scroll(0,350));
	 
		// Wait for 5 second
		Thread.sleep(5000);
	 
		// This will click on Browse button
		//driver.findElement(By.xpath("//div[text()='I am a fresher']")).click();
		driver.findElement(By.xpath("//label[@class='upload-file']")).click();
		
		//C:\Working\Workspace\SeleniumProject\InputFiles\Resume.xlsx
		
		 
		System.out.println("File Upload Button is  clicked"); 
		
		// Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);
		      
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);//virtual keys
		 
		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		 
		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		        
		//Press Enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	 
	}
}





