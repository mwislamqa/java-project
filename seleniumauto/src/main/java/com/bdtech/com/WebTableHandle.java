package com.bdtech.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		int rowCount =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println(rowCount);
		
		
		int cloCount =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td")).size();
		System.out.println(cloCount);
		
		
		/*
		 * for(int i=1;i<=rowCount;i++) {
		 * 
		 * for(int j=1; j<=cloCount;j++) {
		 * System.out.println(driver.findElement(By.xpath(
		 * "//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText());
		 * 
		 * }
		 * 
		 * }
		 */
		 
		
		

		//String rowData =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[2]/td[1]/a/parent::*/following-sibling::td[3]")).getText();
		//System.out.println(rowData);
		
		String rowData =driver.findElement(By.xpath("//a[contains(text(),'Polylink Polymer')]/parent::*/following-sibling::td[3]")).getText();
		System.out.println(rowData);
		
		//find single row racard
		String rowData2 =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]")).getText();
		System.out.println(rowData2);
		
		
		//driver.close();
	}

}
