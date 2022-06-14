package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SimpleLoginPage {
	
		
		//Define all elements of this page
		
		@FindBy(how = How.ID, id = "username")
		private WebElement userName;
		
		@FindBy(how = How.NAME, name = "password")
		private WebElement passwordElement;
		
		@FindBy(how = How.CSS, css = ".signInBtn")
		private WebElement signInBtn;
		

		public SimpleLoginPage(WebDriver driver) {		
			PageFactory.initElements(driver, this);
		}
		
		
		public void enter_userName(String name) {
			userName.sendKeys(name);
		}
		
		public void enter_password(String password) {
			passwordElement.sendKeys(password);
		}		
		
		public void clickOn_signInBtn() {
			signInBtn.click();
		}


}
