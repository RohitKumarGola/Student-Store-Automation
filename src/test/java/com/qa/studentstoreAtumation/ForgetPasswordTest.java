package com.qa.studentstoreAtumation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ForgetPasswordTest {
	ForgetPasswordAction fpa=new ForgetPasswordAction();
	
  @Test(priority=1)
  public void launch_driver() {
	  fpa.launch();
  }
  
  @Test(priority=2)
  public void click_on_signup() throws InterruptedException {
	fpa.signup();

	   }
	
	  @Test(priority=3)
	  public void click_on_forgot() {
	  
	  fpa.forgot();
	  
	  }
	 
	  @Test(priority=4)
	  public void launch_gmail_page() {
		  fpa.launch_gmail_page();
			 
		   }
	  @Test(priority=5)
	  public void login_by_gmail() throws InterruptedException {
		  fpa.login_by_gmail(); 
		   }
	  @Test(priority=6)
	  public void search_mail() throws InterruptedException {
		  fpa.search_mail(); 
		   }
	  @Test(priority=7)
	  public void logo_verify() throws InterruptedException  {
		  fpa.logo_verify(); 
		   }
	
	  @Test(priority=8)
	  public void Ids_verify() throws InterruptedException { 
		  fpa.Id_verify(); 
		  } 
	  @Test(priority=9)
	  public void link_verify()  { 
		  fpa.link_verify(); 
		  } 
	  @Test(priority=10)
	  public void content_verify()  { 
		  fpa.content_verify(); 
		  } 
	  @Test(priority=11)
	  public void clickOn_resetpassword()  { 
		  fpa.resetpassword(); 
		  } 
	  @Test(priority=12)
	  public void fill_newPassword()  { 
		  fpa.newPassword(); 
		  } 
	  @Test(priority=13)
	  public void again_login()  { 
		  fpa.login(); 
		  } 
}