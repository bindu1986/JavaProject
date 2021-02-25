package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample17 {

	/*
	 * 	Launch new Browser
		Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
		Get the value from cell ‘Dubai’ with using dynamic xpath
		Print all the column values of row ‘Clock Tower Hotel’
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.get("http://toolsqa.com/automation-practice-table");
		String slastRow = "2";
		String sCol = "3";
		
		//Here we are locating the xpath by passing variables in the xpath
		
		String sCellValue = driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr[" + slastRow + "]/td[" + sCol + "]")).getText();
		System.out.println(sCellValue);
		
		String sRowValue = "Clock Tower Hotel";
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='content']/table/tbody/tr"));
		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=rows.size();i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
				if(sValue.equalsIgnoreCase(sRowValue)){
					// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
					for (int j=1;j<=5;j++){
						String sColumnValue= driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
						System.out.println(sColumnValue);
					}
				break;
				}
			}
		
		//To get data of all columns from 1st row
		for(int i=1; i<=5; i++){
			System.out.println(driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr/td[" + i + "]")).getText());
		}
		
		//To get data of all columns from last row
		for(int i=1; i<=5; i++){
			System.out.println(driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr[" + rows.size() + "]/td[" + i + "]")).getText());
		}		
		
		//Get the data of last row
		WebElement lastRow = driver.findElement(By.xpath("//div[@id='content']/table/tbody/tr[last()]"));
		List<WebElement> lastRowColumns = lastRow.findElements(By.tagName("td"));
		for(WebElement element:lastRowColumns){
			System.out.println(element.getText());
		}
		
		System.out.println(lastRow.getText());
		
		//Print all headers
		rows = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr/th"));
		for(WebElement element:rows){
			System.out.println("Header - " + element.getText());
		}
		
		driver.close();
	}
}




