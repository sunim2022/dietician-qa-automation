package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	
WebDriver driver;
	
	public ContactUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname") WebElement firstName;
	@FindBy(id="lastname") WebElement lastName;
	@FindBy(id="subject") WebElement subject;
	@FindBy(id="email") WebElement email;
	@FindBy(id="writeyourmsghere") WebElement writeyourmsgheretext;
	
	@FindBy(className="btn") WebElement submitBtn;

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public void setSubject(String subject) {
		this.subject.sendKeys(subject);
	}
	public void setWriteyourmsgheretext(String writeyourmsgheretext) {
		this.writeyourmsgheretext.sendKeys(writeyourmsgheretext);;
	}
	
	public void clickSubmit() {
		submitBtn.click();
	}
}
