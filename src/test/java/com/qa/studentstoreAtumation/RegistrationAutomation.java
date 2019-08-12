package com.qa.studentstoreAtumation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RegistrationAutomation {
	WebDriver driver;
	WebElement e1;
	String id="demotest18062019+30@gmail.com",pass="Password@123";
	 @Test
  public void test01launchdriver() {
	  
			System.setProperty("webdriver.chrome.driver",  "/home/qainfotech/Downloads/chromedriver");
			 driver=new ChromeDriver();  
			driver.get("https://staging.macmillan-learning.com/college/us");
			driver.manage().window().maximize();
	  
	  
  }
  @Test
  public void test02click_on_signup() {
	  
	  driver.findElement(By.cssSelector("a[href=\"/college/us/login\"]")).click();
	  
	   }
  @Test
  public void test03click_on_create_an_account() throws InterruptedException {
	  
	  driver.findElement(By.cssSelector("button#createAccount")).click();
	 driver.findElement(By.cssSelector("input#firstName")).sendKeys("Demo");
	 driver.findElement(By.cssSelector("input#lastName")).sendKeys("Test");
	 driver.findElement(By.cssSelector("input#email")).sendKeys(id);
	 driver.findElement(By.cssSelector("input#password")).sendKeys(pass);
	 driver.findElement(By.cssSelector("input#confirmPassword")).sendKeys(pass);
	
	 WebElement sq1=driver.findElement(By.cssSelector("select#Security_Question_1__c"));
	 Select s1= new Select(sq1);
		s1.selectByVisibleText("What is the first and last name of your first boyfriend or girlfriend?");
		driver.findElement(By.cssSelector("input#Security_Question_1_Answer__c")).sendKeys("a");
		
		WebElement sq2=driver.findElement(By.cssSelector("select#Security_Question_2__c"));
		 Select s2= new Select(sq2);
			s2.selectByVisibleText("What was your favorite place to visit as a child?");
			driver.findElement(By.cssSelector("input#Security_Question_2_Answer__c")).sendKeys("a");
		
			WebElement sq3=driver.findElement(By.cssSelector("select#Security_Question_3__c"));
			 Select s3= new Select(sq3);
				s3.selectByVisibleText("Who is your favorite actor, musician, or artist?");
				driver.findElement(By.cssSelector("input#Security_Question_3_Answer__c")).sendKeys("a");
		
	  driver.findElement(By.cssSelector("input#institution")).sendKeys("Fortis College");
	  driver.findElement(By.cssSelector("input#OptIn__c")).click();
	  driver.findElement(By.cssSelector("input#Terms_of_Service__c")).click();
	  driver.findElement(By.cssSelector("button#signup")).click();
	  Thread.sleep(3000);
				
	   }
  @Test
  public void test04back_on_login() {
	  
	  driver.findElement(By.cssSelector("button#backButton")).click();
	  
	   }
  @Test
  public void test05logo_verify() {
	 String expectedTitle,actualTitle; 
	 expectedTitle="Macmillan Learning";
	 actualTitle=  driver.findElement(By.cssSelector("div.macmillanLearningLogo")).getAttribute("title");
	 Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  @Test
  public void test06launch_gmail_page() {
	  //((JavascriptExecutor)driver).executeScript("window.open()"); 
	  ((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		 
		/*
		 * driver=new ChromeDriver();*/
		  driver.get(
		  "https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession"
		  );
		 
	   }
  @Test
  public void test07login_by_gmail() throws InterruptedException {
	  driver.findElement(By.cssSelector("input#identifierId")).sendKeys("demotest18062019@gmail.com");
	  driver.findElement(By.cssSelector("span.CwaK9")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input.whsOnd.zHQkBf")).sendKeys(pass);
	  driver.findElement(By.cssSelector("span.CwaK9")).click();
	  
	   }
  @Test
  public void test08account_verify() {
	 
	  driver.findElement(By.xpath("//tr[@id=\":2l\"]"));  
  }
}
