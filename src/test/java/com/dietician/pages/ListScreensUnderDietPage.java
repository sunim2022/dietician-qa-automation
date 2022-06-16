package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ListScreensUnderDietPage {
	WebDriver driver;

	@FindBy(id = "SelectedDietician")
	WebElement DieticianDropdown;

	@FindBy(linkText = "ViewRecentDiets")
	WebElement ViewRecentDiets;
	@FindBy(id = "ViewRecentTestReports")
	WebElement ViewRecentTestReports;
	@FindBy(id = "AddNewPatient")
	WebElement AddNewPatient;
	@FindBy(id = "DieticianHome")
	WebElement DieticianHome;
	@FindBy(id = "MyPatients")
	WebElement MyPatients;
	@FindBy(id = "ConfirmConditions And CreatePlan")
	WebElement ConfirmConditionsAndCreatePlan;
	@FindBy(className = "screens")
	WebElement Screens;

	public ListScreensUnderDietPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public String DieticianPageTitle() {
		return driver.getTitle();
	}

	public void ClickScreens() {
		Screens.click();
	}

	public Select getPublicSelect() {
		return new Select(DieticianDropdown);

	}

	public Select getUserSignInSelect() {
		return new Select(ViewRecentDiets);
	}

	public void ClickUserSignIn() {
		ViewRecentDiets.click();
		;
	}

	public Select getregisterSelect() {
		return new Select(ViewRecentTestReports);
	}

	public void clickregister() {
		ViewRecentTestReports.click();

	}

	public Select getTeamSelect() {
		return new Select(AddNewPatient);
	}

	public void clickteam() {
		AddNewPatient.click();
	}

	public Select getTestimonialsSelect() {
		return new Select(DieticianHome);
	}

	public void clicktestimonials() {
		DieticianHome.click();

	}

	public Select getForgotpasswordSelect() {
		return new Select(MyPatients);
	}

	public void clickforgotpassword() {
		MyPatients.click();
	}

	public Select getproductfeaturesSelect() {
		return new Select(ConfirmConditionsAndCreatePlan);
	}

	public void clickproductfeatures() {
		ConfirmConditionsAndCreatePlan.click();
	}

}
