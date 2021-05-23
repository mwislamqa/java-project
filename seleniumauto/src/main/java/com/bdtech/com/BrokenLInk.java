package com.bdtech.com;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLInk {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		

		for (int i = 0; i < links.size(); i++) {
			// by using href attribute we can get all url to required linked
			WebElement elements = links.get(i);
			String url = elements.getAttribute("href");
			URL link = new URL(url);
			// create a connection using url object "link"
			HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
			Thread.sleep(2000);

			httpConn.connect();
			int ressonCode = httpConn.getResponseCode();

			if (ressonCode >= 400) {
				System.out.println(url + " === " + "THIS IS BROKEN LINK");
			} else {
				System.out.println(url + " ==== " + "this is ok link");
			}
		}

	}

}
