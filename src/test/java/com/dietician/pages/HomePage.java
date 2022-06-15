package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(id="title")
	WebElement title;

	@FindBy(id = "companyName")
	@CacheLookup
	WebElement logoImage;

	@FindBy(id="product") WebElement product;
	@FindBy(linkText="doctors") WebElement doctors;
	@FindBy(linkText="clients") WebElement clients;
	@FindBy(linkText="teams") WebElement teams;
	@FindBy(linkText="register") WebElement register;
	@FindBy(linkText="aboutus") WebElement aboutus;
	@FindBy(linkText="features") WebElement features;
	@FindBy(linkText="blogs") WebElement blogs;
	@FindBy(linkText="contactus") WebElement contactus;
	@FindBy(linkText="Search") WebElement search;
	@FindBy(linkText="SignIn") WebElement signin;

	public void clickProduct() { product.click(); }
	public void clickDoctorsLink() {doctors.click(); }
	public void clickClientLink() { clients.click(); }
	public void clickTeamsLink() { teams.click(); }
	public void clickRegisterLink() { register.click(); }
	public void clickAboutUsLink() { aboutus.click(); }
	public void clickFeatureLink() { features.click(); }
	public void clickBlogsLink() { blogs.click(); }
	public void clickContactUsLink() { contactus.click(); }
	public void clickSearchLink() { search.click(); }
	public void clickSigninLink() { signin.click(); }


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public boolean isLogoImageDisplayed() {
		return logoImage.isEnabled() && logoImage.isDisplayed();
	}

	public boolean isProductTabDisplayed() {
		return product.isEnabled() && product.isDisplayed() && product.getText().equals("PRODUCT");
	}
	public boolean isClientTabDisplayed() {
		return clients.isEnabled() && clients.isDisplayed() && clients.getText().equals("CLIENTS");

	}
	public boolean isTeamsTabDisplayed() {
		return teams.isEnabled() && teams.isDisplayed() && teams.getText().equals("TEAMS");
	}
	public boolean isRegisterTabDisplayed() {
		return register.isEnabled() && register.isDisplayed() && register.getText().equals("REGISTER");
	}
	public boolean isFeaturesTabDisplayed() {
		return features.isEnabled() && features.isDisplayed() && features.getText().equals("FEATURES");
	}

	public boolean isAboutUsTabDisplayed() {
		return aboutus.isEnabled() && aboutus.isDisplayed() && aboutus.getText().equals("ABOUT US");
	}
	public boolean isBlogsTabDisplayed() {
		return blogs.isEnabled() && blogs.isDisplayed() && blogs.getText().equals("BLOGS");
	}
	public boolean isContactUsTabDisplayed() {
		return contactus.isEnabled() && contactus.isDisplayed() && contactus.getText().equals("CONTACT US");
	}
	public boolean isSearchDisplayed(){
		return search.isEnabled() && search.isDisplayed();
	}
	public boolean isSignInDisplayed() {
		return signin.isEnabled() && signin.isDisplayed();
	}

}
