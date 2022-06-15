package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorsTeam {

	WebDriver driver;

	public DoctorsTeam(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	WebElement docName;

	public boolean isDoctorsNameDisplayed() {
		return docName.isEnabled() && docName.isDisplayed();
	}

	public boolean isDefaultDoctorPresent(String name) {
		return docName.isEnabled() && docName.isDisplayed() && docName.equals(name);
	}

	@FindBy(className = "btn")
	WebElement prevBtn;

	public boolean isPrevBtnDisabled() {
		return !prevBtn.isEnabled();
	}

	public void clickPrevButton() {
		prevBtn.click();
	}

	@FindBy(className = "btn")
	WebElement nextBtn;

	public boolean isNextBtnDisabled() {
		return !nextBtn.isEnabled();
	}

	public void clickNxtButton() {
		nextBtn.click();
	}

}
