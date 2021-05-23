package com.bdtech.com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoodLink {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total links   :" + links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement elements = links.get(i);
			String url = elements.getAttribute("href");

			veryfyLinkActive(url);
		}

	}

	public static void veryfyLinkActive(String linkUrl) throws IOException {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlconnection = (HttpURLConnection) url.openConnection();

			httpUrlconnection.setConnectTimeout(3000);
			httpUrlconnection.connect();
			if (httpUrlconnection.getResponseCode() == 200) {
				System.out.println(linkUrl + "--" + httpUrlconnection.getResponseMessage());
			}
			if (httpUrlconnection.getResponseCode() == httpUrlconnection.HTTP_NOT_FOUND) {

			}

		} catch (MalformedURLException e) {

			e.printStackTrace();
		}

	}

}
