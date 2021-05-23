package com.bdtech.com;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHoper {

	public WebDriver driver;

	@BeforeTest()
	public void setup() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.barnesandnoble.com/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@Test
	public void test() {
		try{WebElement books =driver.findElement(By.xpath("//li[@id='topNav1']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(books).build().perform();
		}
		catch(NoSuchElementException e) {
		driver.findElement(By.xpath("//*[@id=\"topNav1\"]/div/div[1]/div[2]/div[1]/h2")).click();
		}

	}

}
