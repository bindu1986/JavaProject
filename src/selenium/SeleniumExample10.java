package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample10 {
	public void signUpSwiss() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Working\\WorkSpace\\SeleniumProject\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
   // WebElement  iFrameInside = driver.findElement(By.xpath("//iframe[@src='https://cloud.e.swisschalet.com/signup19']"));
   // driver.switchTo().frame(iFrameInside);
    driver.get("https://www.swisschalet.com/en/rotisseriemail.html");
    WebElement  iFrameInside = driver.findElement(By.xpath("//iframe[@src='https://cloud.e.swisschalet.com/signup19']"));
    driver.switchTo().frame(iFrameInside);
	WebElement email= driver.findElement(By.xpath("//form[@id='smartCaptureV2-1563477552323']/div/div/input[@type='email']"));
	//JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("arguments[0].scrollIntoView(true);",email);		 

	email.sendKeys("Bindu.bhinder@gmail.com");
	WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));
	fname.sendKeys("Bindu");	
	WebElement lname=driver.findElement(By.xpath("//input[@name='last_name']"));
	lname.sendKeys("Bhinder");
	WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
	city.sendKeys("Brampton");
	WebElement Birthday=driver.findElement(By.linkText("*Please select your Birthday:"));
	 Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
	    sel1.selectByIndex(4);

	    Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
	    sel2.selectByValue("6");

	    Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
	    sel3.selectByValue("2013");

	//Birthday.sendKeys("02/01/1986");
	//List<WebElement> dates = Birthday.findElements(By.xpath("//input[@class='span2']"));
	//Birthday.sendKeys("02/01/1986");
//for(WebElement element: dates){
	//if(element.getText().contentEquals("28")){
			//element.click();
		//	break;	}
		
      WebElement pCode=driver.findElement(By.xpath("//input[@name='postal_code']"));
pCode.sendKeys("l7a5a6");
WebElement province=driver.findElement(By.id("province"));
province.click();
Select s1 = new Select(driver.findElement(By.id("province")));
s1.selectByVisibleText("Ontario");
//s1.selectByIndex(4);
//s1.selectByValue("ONTARIO");
//}
	WebElement favLoc= driver.findElement(By.id("SWI_favourite_location"));
	Select s2=new Select((WebElement)favLoc);
	s2.selectByValue("Brampton");
	WebElement secFavLoc=driver.findElement(By.xpath("//form[@id='smartCaptureV2-1563477552323']/div/div[9]/select[@name='SWI_secondary_favourite_location']"));
	
	}
public static void main(String[] args)  throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C:\\Working\\WorkSpace\\SeleniumProject\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	SeleniumExample10 obj=new SeleniumExample10();
	obj.signUpSwiss();
}

	}		

	
