package com.bdtech.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;

public class CompsiteXapth {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		  driver.findElement(new ByAll(By.id("u_0_f"),By.name("firstname"),
		  By.xpath("//input[@name='firstname']"))).sendKeys("md");
		 
		//driver.findElement(new ByIdOrName("firstname")).sendKeys("md");
	}

}
