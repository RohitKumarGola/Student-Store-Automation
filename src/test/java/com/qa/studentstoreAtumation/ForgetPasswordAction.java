package com.qa.studentstoreAtumation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ForgetPasswordAction extends GetPage {
	// WebDriver driver;


	public void launch() {
		launchbrowser();
		getDriver("https://"+ DataRead.getValues("url"));

		//System.setProperty("webdriver.chrome.driver",  "/home/qainfotech/Downloads/chromedriver");
		// driver=new ChromeDriver();  
		//driver.get("https://staging.macmillan-learning.com/college/us");
	}


	public void signup() throws InterruptedException {
		// TODO Auto-generated method stub
		waiting(3000);
		/* clickOnSignUp().click(); */

		DataRead.getElement("signup").click();
		/*
		 * if(s[0].equals("css")) {
		 * 
		 * driver.findElement(By.cssSelector(s[1])).click(); } else
		 * if(s[0].equals("xpath")) { System.out.println(s[0]+"="+s[1]);
		 * 
		 * driver.findElement(By.xpath(s[1])).click(); } else if(s[0].equals("id")) {
		 * 
		 * driver.findElement(By.id(s[1])).click(); } else {
		 * 
		 * driver.findElement(By.className(s[1])).click(); }
		 */


	}


	public void forgot() {
		DataRead.getElement("forgot").click();
		DataRead.getElement("email").sendKeys("demotest18062019+30@gmail.com");
		DataRead.getElement("resetpass").click();
		DataRead.getElement("SecurityAns").sendKeys("a");
		DataRead.getElement("SubmitAns").click();
	}


	public void launch_gmail_page() {
		

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  getDriver("https://"+ DataRead.getValues("gmail_url")); 
	}


	public void login_by_gmail() throws InterruptedException {
		// TODO Auto-generated method stub
		DataRead.getElement("email").sendKeys("demotest18062019@gmail.com",Keys.ENTER);
		waiting(5000);
		DataRead.getElement("password").sendKeys("Password@123",Keys.ENTER);
		
	}

	
	public void search_mail() throws InterruptedException {
		DataRead.getElement("search_mail").sendKeys("demotest18062019+30@gmail.com",Keys.ENTER);
		waiting(5000);
		DataRead.getElement("mail").click();
	}


	public void logo_verify() throws InterruptedException  {
		Thread.sleep(10000);
		//waiting(20000);
		String expected="Instructor Catalog";
		//System.out.println(driver.findElement(By.cssSelector("img[alt=\"Instructor Catalog\"]")).getTagName());
		Assert.assertEquals(DataRead.getElement("logo").getAttribute("alt"), expected);
	}


	public void Id_verify() throws InterruptedException {
		
		  DataRead.getElement("click").click();
		
		
		  String senderExpected="noreply@mldev.cloud"; 
		  String ReceiverExpected="demotest18062019+30@gmail.com"; 
		  String SubjectExpected="Macmillan Learning :: Reset Password";
		  Assert.assertEquals(DataRead.getElement("sender").getText(),senderExpected); 
		  Assert.assertEquals(DataRead.getElement("receiver").getText(),ReceiverExpected); 
		  Assert.assertEquals(DataRead.getElement("subject").getText(),SubjectExpected);
		  DataRead.getElement("click").click();
		 
	}


	public void link_verify() {
		String linkExpected="Reset Password";
		Assert.assertEquals(DataRead.getElement("link").getText(),linkExpected); 
	}


	public void content_verify() {
		String str="";
		String s1 ="HiDemoTest,ToresetyourpasswordandlogintoInstructorCatalog,pleaseclickonthefollowinglink.Thislinkwillexpireafter24hours.Ifthelinkhasexpiredyoucaninitiateanotherpasswordresetrequest.ResetPasswordHappylearning!YourInstructorCatalogSupportTeam";
		for(int i=1; i<4;i++) {
			str+=DataRead.getElement("p"+i).getText().toString();	
		}
		str=str.replaceAll("\n", "");
		str=str.replaceAll(" ", "");
		//System.out.println(str);
		Assert.assertEquals(str,s1);
		}


	public void resetpassword() {
		DataRead.getElement("link").click();
		
	}


	public void newPassword() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(2));
		  DataRead.getElement("newpass").sendKeys("Password@1234");
		  DataRead.getElement("confirmpass").sendKeys("Password@1234");
		  DataRead.getElement("resetpassword").click();
	}


	public void login() {
		DataRead.getElement("login").click();
		DataRead.getElement("email").sendKeys("demotest18062019+30@gmail.com");
		DataRead.getElement("newpassword").sendKeys("Password@1234");
		DataRead.getElement("signin").click();
	}
	
	
	
	

}
	 

	

