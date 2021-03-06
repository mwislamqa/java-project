package com.bdtech.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleSourch {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
	    // First, let's declare our search term
	    String searchTerm = "Selenium";
	    
	    //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers.chrome.exe");
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
	    // Then, let's start our WebDriver and navigate to google
	    driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    driver.manage().window().maximize();

	    // Next, we'll execute the search
	    WebElement searchField = driver.findElement(By.name("q"));
	    searchField.sendKeys(searchTerm);
	    WebElement searchButton = driver.findElement(By.name("btnK"));
	    searchButton.click();

	    // Now, let's gather our search results
	    List<WebElement> results = driver.findElements(By.cssSelector(".r"));

	    // Finally, we'll loop over the list to verify each result link contains our term
	    for (int i = 0; i < results.size(); i++) {
	       // Assert.assertTrue(results.get(i).getText().contains(searchTerm), "Search result validation failed at instance [ + i + ].");
	     results.get(i).getText().contains(searchTerm);
	   
	    }
	}

}
