package com.qa.studentstoreAtumation;

import org.testng.annotations.Test;

public class ResetPasswordTest {
	 
	  @Test(priority=1)
	  public void launch_driver() {
		ResetPasswordAction.launch();
	  }
	  @Test(priority=2)
	  public void click_on_signup() throws InterruptedException {
		  ResetPasswordAction.signup();

		   }
	  @Test(priority=3)
	  public void fill_credentials() {
		  ResetPasswordAction.fill_credentials();

		   }
	  @Test(priority=4)
	  public void for_resetPassword () {
		  ResetPasswordAction.click_on_myAccount();
		  ResetPasswordAction.click_on_chnagePass();

		   }
	  @Test(priority=5)
	  public void fill_idandscQ () {
		  ResetPasswordAction.fill_idandscQ();
		 }
	  @Test(priority=6)
	  public void launch_gmail_page() {
		  ResetPasswordAction.launch_gmail_page();
		 }
	  @Test(priority=7)
	  public void login_by_gmail() throws InterruptedException  {
		  ResetPasswordAction.login_by_gmail(); 
		   }
	  @Test(priority=8)
	  public void search_mail() throws InterruptedException {
		  ResetPasswordAction.search_mail(); 
		   }
	  @Test(priority=9)
	  public void logo_verify() throws InterruptedException  {
		  ResetPasswordAction.logo_verify(); 
		   }
	  @Test(priority=10)
	  public void Ids_verify() throws InterruptedException { 
		  ResetPasswordAction.Id_verify(); 
		  } 
	  @Test(priority=11)
	  public void link_verify()  { 
		  ResetPasswordAction.link_verify(); 
		  }
	  @Test(priority=12)
	  public void content_verify()  { 
		  ResetPasswordAction.content_verify(); 
		  }
	  @Test(priority=11)
	  public void clickOn_resetpassword()  { 
		  ResetPasswordAction.resetpassword(); 
		  } 
	  @Test(priority=12)
	  public void fill_newPassword()  { 
		  ResetPasswordAction.newPassword(); 
		  }
	  @Test(priority=13)
	  public void again_login()  { 
		  ResetPasswordAction.login(); 
		  } 
}
