package com.bdtech.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenshot {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:www.google.com");
		driver.findElement(By.name("a")).sendKeys("md");
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("q")));
		//TakesScreenshot is an interface 
		File serfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir= System.getProperty("user.dir");
		try {
			//FileUtils.copyFile(serfile, new File("C:\\EclipseWork space\\seleniumauto.png"));
			FileUtils.copyFile(serfile, new File(currentDir+"/screenshots/"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
