package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends BassClass {
public Register (){
		
		PageFactory.initElements(driver, this);
}

	@FindBy (xpath="//td[@Class='login_register']")
	private WebElement newUser;
	
	@FindBy (name="username")
	private WebElement username;
	
	@FindBy (name="password")
	private WebElement pass;
	
	@FindBy (name="re_password")
	private WebElement cnfpass;
	
	@FindBy (name="full_name")
	private WebElement fullname;
	
	@FindBy (name="email_add")
	private WebElement emailAdd;
		
	@FindBy (name="tnc_box")
	private WebElement clickTOS;
	
	@FindBy (name="Submit")
	private WebElement btnRegister;
	
	
	public WebElement getBtnRegister() {
		return btnRegister;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getCnfpass() {
		return cnfpass;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getEmailAdd() {
		return emailAdd;
	}

	public WebElement getClickTOS() {
		return clickTOS;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getNewUser() {
		return newUser;
	}

	
}

