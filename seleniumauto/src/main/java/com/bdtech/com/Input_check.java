package com.bdtech.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Input_check {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(
				"https://www.ups.com/lasso/login?loc=en_US&returnto=https%3A%2F%2Fwww.ups.com%2Fus%2Fen%2FHome.page");

		WebElement userName = driver.findElement(By.id("email"));
		
		//Assert.assertEquals("email",userName.getAttribute("id"),(String) isEmptyString());
		Assert.assertEquals(false,userName.getAttribute("id").isEmpty());

		/*
		 * String text = userName.getAttribute("id"); 
		 * if (text.isEmpty()) {
		 * System.out.println("input box is empty"); }
		 *  else {
		 * System.out.println("input is not empty"); }
		 */
		userName.clear();
		driver.findElement(By.id("email")).sendKeys("radiya123");
	
		driver.findElement(By.id("pwd")).sendKeys("123456789ssR");
		
		driver.findElement(By.id("submitBtn")).click();
	}

}
