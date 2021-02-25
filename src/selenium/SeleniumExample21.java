package selenium;

//public class SeleniumExample21 {

	//public static void main(String[] args) {

		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedCondition;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		 
		public class SeleniumExample21{
		 
			public static void main(String[] args) {
				
				//Explicit Wait
		 
				// Start browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		 
				// Start application
				driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		 
				// Click on timer button to start
				driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		 
				//WebElement ele = driver.findElement(By.xpath("//p[text()='Selenium']"));
				
				WebDriverWait wait = new WebDriverWait(driver, 15);
		 
				
				 By locator = By.xpath("//p[text()='WebDriver']");
				WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
				//WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 
				// if element found then we will use- In this example I just called isDisplayed method
				boolean status = ele.isDisplayed();
		 
				// if else condition
				if (status) {
					System.out.println("===== Text WebDriver is visible======");
				} else {
					System.out.println("===== Text WebDriver is not visible======");
				}
			}
		

	
	// TODO Auto-generated method stub

	}


