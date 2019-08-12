package com.qa.studentstoreAtumation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPage {
	static WebDriver driver;

	public static void launchbrowser() {
		/*
		 * System.out.println("FilePath:"+DataRead.getValues(driver,"driverpathinfo",
		 * "data.txt"));
		 */

		System.setProperty("webdriver.chrome.driver","/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void getDriver(String url) {
		driver.get(url);
	}
	
	/*
	 * public static WebElement clickOnSignUp() { String s[]=
	 * DataRead.getElement(driver,"signup","data.txt"); if(s[0].equals("css")) {
	 * return driver.findElement(By.cssSelector(s[1])); } else
	 * if(s[0].equals("xpath")) { System.out.println(s[0]+"="+s[1]);
	 * 
	 * return driver.findElement(By.xpath(s[1])); } else if(s[0].equals("id")) {
	 * return driver.findElement(By.id(s[1])); } else { return
	 * driver.findElement(By.className(s[1])); }
	 * 
	 * }
	 */
	
	


	public static void waiting(int time) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.MILLISECONDS) ;
	}

	
}
