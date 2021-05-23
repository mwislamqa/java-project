package com.bdtech.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Scroll_down {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		
	 driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 String gt=driver.getTitle();
	 System.out.println(gt);
	 driver.manage().window().maximize();
		
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  //js.executeScript(Script,Arguments);
		  
		  js.executeScript("window.scrollBy(30,500)"); //Scroll vertically down by 1000
		  // pixels
		 		 
	 // selenium commond for scroll down
		/*
		 * WebElement fb= driver.findElement(By.id("facebook")); Actions actions = new
		 * Actions(driver);
		 * 
		 * actions.clickAndHold(fb).moveByOffset(0,5000).release().perform();
		 */

	
}
}
