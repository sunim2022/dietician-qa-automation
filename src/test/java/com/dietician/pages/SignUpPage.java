package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dietician.factory.DriverFactory;


public class SignUpPage {
	WebDriver driver = DriverFactory.getDriver();

	@FindBy(id="firstname")WebElement firstname1;
	@FindBy(id="lastname")WebElement lastname2;
	@FindBy(id="mobilenumber")WebElement mobilenumber1;

	@FindBy(id="anyotherfield")WebElement anyotherfield1;
	@FindBy(id="email")WebElement email1;
	@FindBy(id="password")WebElement password1;
	@FindBy(id="sign up")WebElement signup;
	@FindBy(id="name")WebElement name1 ;
	@FindBy(id="username")WebElement username1;
	@FindBy(id="confirmpassword")WebElement confirmpassword1;
	@FindBy(id="facebook")WebElement facebook;
	@FindBy(id="google")WebElement google;
	@FindBy(linkText="login")WebElement login;
	@FindBy(id="register")WebElement register;


	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String signUpPageTitle()
	{
		return driver.getTitle();
	}
	
	public void enterfirstname(String firstname) {
		firstname1.sendKeys(firstname);
	}
	public void enterlastname(String lastname) {
		lastname2.sendKeys(lastname);
	}
	public void entermobnumer(String mobilenumber) {
		mobilenumber1.sendKeys(mobilenumber);
	}
	public void enteranyotherfield(String anyotherfield) {
	     anyotherfield1.sendKeys(anyotherfield);
	}
	public void enteremail(String email) {
		email1.sendKeys(email);
	}
	public void Clicks_signup() {
		signup.click();
		}
	public void entername(String name) {
		name1.sendKeys(name);
	}
	public void enterlastname1(String lastname) {
		lastname2.sendKeys(lastname);
	}
	public void enterusername(String username) {
		username1.sendKeys(username);
	}
	
	public void enteremail1(String email) {
		email1.sendKeys(email);
	}
	
	public void enterpassword1(String password) {
		password1.sendKeys(password);
	}
	
	public void enterconfirmpass(String confirmpass) {
		confirmpassword1.sendKeys(confirmpass);
	}
	public void clickSignup() {
		signup.click();
	}
	public void clickfacebook() {
		facebook.click();
	}
	public void clickgoogle() {
		google.click();
	}
	public void clicklogin() {
		login.click();

	}
	public String registerPageTitle() {
		return driver.getTitle();
	}

	public void Click_register() {
	register.click();
		
	}
}
