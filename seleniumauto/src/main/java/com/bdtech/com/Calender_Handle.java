package com.bdtech.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"package-departing-hp-package\"]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100");
		
		List <WebElement>list=driver.findElements(By.xpath("//div[@class='datepicker-cal-month']/table[1]//td"));
		
		for(int i=0;i<list.size();i++) {
			
			String listvalue=list.get(i).getText();
			
			if(listvalue.equalsIgnoreCase("30")) {
				
				list.get(i).click();
				break;
			}
			
		}
			
			
			
			
			

	}

}
