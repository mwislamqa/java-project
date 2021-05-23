package com.bdtech.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiWindow {
	
	WebDriver driver;
	@BeforeTest()
	public void setup() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.barnesandnoble.com/");


}
	@Test
	public void WindowTest(){
		String parent=driver.getWindowHandle();
		
		for(String child: driver.getWindowHandles()){
			System.out.println("window"+driver.getWindowHandles().size());
			driver.switchTo().window(child);
		}
	}
}