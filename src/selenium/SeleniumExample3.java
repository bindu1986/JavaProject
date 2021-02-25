package selenium;

import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SeleniumExample3{

			WebElement iFrameInside;
			WebDriver driver;
			By firstLink =By.tagName("a");
			WebElement locatedEle;
			List<WebElement> allLinks;
			List<WebElement> sortableLink;
			WebElement Drag;
			WebElement Drop;
			static String url ="http://jqueryui.com/droppable/";
			String text;
			String attributeValue;

	
			//getText
			//We will use get attribute when we need to get text from textbox

	
			public void getText(WebElement element){ //user defined method getText
			 text=element.getText();
			 System.out.println("firstLink text is : " + text);  
			}

	
			// getAttribute

			public void getAttribute(WebElement element,String attribute){
			attribute=element.getAttribute(attribute);
			System.out.println("Attribute value is :  " + attribute);

			}


			//List of webElement and size of it and Loop through list

			public void listOfWebElements(){
				List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			     System.out.println("The number of links - " + allLinks.size());

			     for(int i=0; i<allLinks.size(); i++){
			  System.out.println(allLinks.get(i).getText() + "-------------" + allLinks.get(i).getAttribute("href"));
			/*
			if(allLinks.get(i).getAttribute("href").contentEquals("")){
			System.out.println("Broken Link - " + allLinks.get(i).getText());
			}

			  for(WebElement element:allLinks){
			System.out.println("New For Loop - " + element.getText());
			 } */
			     }
			     
			     //a[text()='Sortable']
			     
			  sortableLink= driver.findElements(By.linkText("Sortable"));
			System.out.println("Size of sortable Link is : " +sortableLink.size());

			     
			}


			    //switch to the frame and back to default content
			/*
			 * switchTo()defaultContent() This method is for switching to and fro in between frames and parent frames. The focus is shifted to the main page.
       * switchTo().parentFrame() This method is used to switch the control to the parent frame of the current frame.
			 */
			   public void switchToFrame(){
			     
			  //First method
			         iFrameInside = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			         driver.switchTo().frame(iFrameInside);

			        //Second method to switch to the iFrame
			         // driver.switchTo().frame(0);

			          Drag = driver.findElement(By.id("draggable"));
			          Drop = driver.findElement(By.id("droppable"));

			          Actions builder= new Actions(driver);
			          builder.dragAndDrop(Drag, Drop).build().perform();

			         sortableLink= driver.findElements(By.linkText("Sortable"));
			         System.out.println("Inside frame and Size of sortable Link is : " +sortableLink.size());

			    driver.switchTo().defaultContent();

			 sortableLink= driver.findElements(By.linkText("Sortable"));
			   System.out.println("Outside frame and Size of sortable Link is : " +sortableLink.size());
			 }
			   
			   
			   public void testcase1(){
			 
			  System.setProperty("webdriver.chrome.driver", "C:\\Working\\Workspace\\SeleniumProject\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get(url);
			  WebElement locatedEle =driver.findElement(By.tagName("a"));
			 
			  //Reusing the  Methods
			     
			  getText(locatedEle);

			   
			 getAttribute(locatedEle, "href");
			   
			  listOfWebElements();
			   
			   switchToFrame();
			   }



			public static void main(String[] args) throws InterruptedException {

			SeleniumExample3 obj= new SeleniumExample3();
			obj.testcase1();


			}

}
