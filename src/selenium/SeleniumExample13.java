package selenium;

//public class SeleniumExample13 {


	import org.openqa.selenium.Proxy;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	 
	//This Example talks about Proxy Settings

	/*
	 * Additional Info and Steps
	 How to Handle Proxy in Selenium Webdriver

	1- Change the proxy setting manually and open default browser.

	2- Change the proxy setting using Webdriver code.

	In this post, we will see second approach

	To handle proxy setting in Selenium we have separate class called Proxy that is available inside org.openqa.selenium package

	Approach-

	1-Create object of proxy class and set http proxy or ftp proxy based on requirement

	These are methods available for proxy.

	2 -Use DesiredCapability class to customize capability of browser and pass proxy object.

	3- While initiating browser pass capability object

	Lets implement the same-How to Handle Proxy in Selenium Webdriver

	Once you execute above program, proxy setting will be set in browser, you can check through browser setting
	 */
	//public class SeleniumExample13 {
	public class SeleniumExample13 {

	 public static void main(String[] args) {
	  // Create proxy class object
	  Proxy p=new Proxy();
	 
	  // Set HTTP Port to 7777
	  p.setHttpProxy("localhost:7777");
	 
	  // Create desired Capability object
	  DesiredCapabilities cap=new DesiredCapabilities();
	 
	  // Pass proxy object p
	  cap.setCapability(CapabilityType.PROXY, p);
	 
	  // Open  firefox browser
	  WebDriver driver=new FirefoxDriver(cap);
	  // from here onwards code will be same as normal script
	 }
	}
	 
	





