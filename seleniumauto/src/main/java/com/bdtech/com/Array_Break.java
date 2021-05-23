package com.bdtech.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Array_Break {
	static WebDriver driver= null;
	
	static {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.ups.com/us/en/Home.page?");

	}

	
	  public static void main(String[] args) {
	  
	  final int a = 3; 
	  System.out.println(a + a);
	  
	  int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
	  for (int i = 0; i < b.length;
	  i++) {
	  
	  if (i == 4) { break; } 
	  System.out.println(b[i]); }
	  
	  }
	 

}
