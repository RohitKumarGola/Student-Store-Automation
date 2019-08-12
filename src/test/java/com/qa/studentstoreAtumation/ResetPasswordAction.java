package com.qa.studentstoreAtumation;

public class ResetPasswordAction {
	static ForgetPasswordAction fpa=new ForgetPasswordAction();
	public static void launch() {
		fpa.launch();
	}
	public static void signup() throws InterruptedException {
		fpa.signup();
	}
	public static void fill_credentials() {
		DataRead.getElement("email").sendKeys("demotest18062019+30@gmail.com");
		DataRead.getElement("newpassword").sendKeys("Password@1234");
		DataRead.getElement("signin").click();
		
	}
	public static void click_on_myAccount() {
		DataRead.getElement("myaccount").click();	
		
	}
	public static void click_on_chnagePass() {
		DataRead.getElement("changePassword").click();	
	}
	public static void fill_idandscQ() {
		DataRead.getElement("email").sendKeys("demotest18062019+30@gmail.com");
		DataRead.getElement("resetpass").click();
		DataRead.getElement("SecurityAns").sendKeys("a");
		DataRead.getElement("SubmitAns").click();	}
	public static void launch_gmail_page() {
		fpa.launch_gmail_page();
	}
	public static void login_by_gmail() throws InterruptedException {
		fpa.login_by_gmail();
		
	}
	public static void search_mail() throws InterruptedException {
		fpa.search_mail();
	}
	public static void logo_verify() throws InterruptedException {
	fpa.logo_verify();
	}
	public static void Id_verify() throws InterruptedException {
		fpa.Id_verify();
	}
	public static void link_verify() {
		fpa.link_verify();
		
	}
	public static void content_verify() {
	fpa.content_verify();
	}
	public static void resetpassword() {
	fpa.resetpassword(); 	
	}
	public static void newPassword() {
	fpa.newPassword(); 
	}
	public static void login() {
	fpa.login();
	}

}
