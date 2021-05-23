package com.bdtech.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysJavaScript {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement send=driver.findElement(By.name("firstname"));
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].value='md'", send);
		//jse.executeScript("aguments[0].value='md'", send);
		jse.executeScript("window.scrollBy(0,5000)");
		
	}

}
