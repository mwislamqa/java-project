package com.bdtech.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 class DataProviderDemo {
	@DataProvider(name="login")
	public Object[][] login() {
		Object[][] result= new Object[4][2];
		result [0][0]="radiya123";
		result [0][1]= "123456789SSR";
		
		result [1][0]="radiya123";
		result [1][1]= "123456789SSR";
		
		result [2][0]="radiya123";
		result [2][1]= "123456789SSR";
		
		result [3][0]="radiya123";
		result [3][1]= "123456789SSR";
		return result;
		
	}
	@Test(dataProvider="login")
	public void TestDataProvider(String userName,String pass) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		//System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ups.com/lasso/login?loc=en_US&returnto=https%3A%2F%2Fwww.ups.com%2Fus%2Fen%2FHome.page");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pwd")).sendKeys(pass);
		driver.findElement(By.id("submitBtn")).click();
		
		
	}
	

}
