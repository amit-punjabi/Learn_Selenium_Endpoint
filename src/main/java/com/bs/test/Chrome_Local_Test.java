package com.bs.test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Chrome_Local_Test {
	
	public static void main(String[] args) throws Exception {
		
		String HUB_URL = "http://localhost:4446/wd/hub";				// Selenium HUB URL
		
		String AUT_URL = "https://the-internet.herokuapp.com/login";	// URL of APPLICATION UNDER TEST
		
		URL URLObj = new URL(HUB_URL);			// URL object represents a Uniform Resource Locator, a pointer to a "resource" on the World Wide Web

		DesiredCapabilities caps = new DesiredCapabilities(); 	// CREATE DESIRED CAPABILITIES OBJECT
		
		caps.setCapability("browserName", "chrome"); 			// PROVIDE BROWSER NAME
		
		WebDriver driver = new RemoteWebDriver(URLObj, caps); 	// CREATE WEN DRIVER INSTANCE
		
//		driver.manage().window().maximize();					// MAXIMIZE WINDOW
		
		driver.get(AUT_URL);									// OPEN URL
	
		WebElement element = driver.findElement(By.xpath(".//button[@type='submit']")); // FIND THE ELEMENT
		
		element.click();										// PERFORM CLICK OPERATION
		
		Thread.sleep(2000);
		
		driver.quit();											// CLOSE WEB DRIVER INSTANCE
		
	} // MAIN END

} // CLASS END
