package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConfirmConditionsAndCreatePlanPage {
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_page_Title")
	private WebElement pageTitle;
	
	
	@FindBy(how=How.NAME, name = "condition1")
	private WebElement condition1;
	
	
	
	@FindBy(how=How.NAME, name = "condition2")
	private WebElement condition2;
	
	@FindBy(how=How.NAME, name = "condition3")
	private WebElement condition3;
	
	@FindBy(how=How.NAME, name = "condition4")
	private WebElement condition4;
	
	
	@FindBy(how=How.NAME, name = "coMorbidiCondition1")
	private WebElement coMorbidiCondition1;
	
	@FindBy(how=How.NAME, name = "coMorbidiCcondition2")
	private WebElement coMorbidiCcondition2;
	
	@FindBy(how=How.NAME, name = "coMorbidiCcondition3")
	private WebElement coMorbidiCcondition3;
	
	@FindBy(how=How.NAME, name = "coMorbidiCcondition4")
	private WebElement coMorbidiCcondition4;
	
	@FindBy(how=How.NAME, name = "preference1")
	private WebElement preference1;
	
	@FindBy(how=How.NAME, name = "preference2")
	private WebElement preference2;
	
	@FindBy(how=How.NAME, name = "preference3")
	private WebElement preference3;
	
	@FindBy(how=How.NAME, name = "confirmBtnOption1")
	private WebElement confirmBtnOption1;
	
	
	@FindBy(how=How.NAME, name = "selectValue1")
	private WebElement selectValue1;
	
	@FindBy(how=How.NAME, name = "selectValue2")
	private WebElement selectValue2;
	
	@FindBy(how=How.NAME, name = "selectValue3")
	private WebElement selectValue3;
	
	@FindBy(how=How.NAME, name = "coMorbidiValue1")
	private WebElement coMorbidiValue1;
	
	@FindBy(how=How.NAME, name = "coMorbidiValue2")
	private WebElement coMorbidiValue2;
	
	@FindBy(how=How.NAME, name = "coMorbidiValue3")
	private WebElement coMorbidiValue3;
	
	@FindBy(how=How.NAME, name = "preferenceValue1")
	private WebElement preferenceValue1;
	
	@FindBy(how=How.NAME, name = "preferenceValue2")
	private WebElement preferenceValue2;
	
	@FindBy(how=How.NAME, name = "preferenceValue3")
	private WebElement preferenceValue3;
	
	@FindBy(how=How.NAME, name = "confirmBtnOption2")
	private WebElement confirmBtnOption2;
	
	
	@FindBy(how=How.NAME, name = "generateMenuBtn")
	private WebElement generateMenuBtn;
	

	public ConfirmConditionsAndCreatePlanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		
		String title = pageTitle.getText();
		return title;
	}
	
	public void clickOn_confirmBtnOption1() {
		confirmBtnOption1.click();
	}
	
	public void clickOn_confirmBtnOption2() {
		confirmBtnOption2.click();
	}

	public void clickOn_generateMenuBtn() {
		generateMenuBtn.click();
	}
	
	public boolean canEditConditions() {
		if(condition1.isEnabled() && condition2.isEnabled() && condition3.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean canEditPreferences() {
		if(preference1.isEnabled() && preference2.isEnabled() && preference3.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void selectCoMorbidiCondition(String condition) {
		
		if(condition.equals("coMorbidiCondition1")) {
			coMorbidiCondition1.click();
		} else if(condition.equals("coMorbidiCondition2")) {
			coMorbidiCcondition2.click();
		} else if(condition.equals("coMorbidiCondition3")) {
			coMorbidiCcondition3.click();
		} else if(condition.equals("coMorbidiCondition4")) {
			coMorbidiCcondition4.click();
		} 
	}
	
	public void selectPreference(String preference) {
		
		if(preference.equals("preference1")) {
			preference1.click();
		} else if(preference.equals("preference2")) {
			preference2.click();
		} else if(preference.equals("preference3")) {
			preference3.click();
		} 
	}
	
	public void selectCondition(String condition) {
		
		if(condition.equals("condition1")) {
			condition1.click();
		} else if(condition.equals("condition2")) {
			condition2.click();
		} else if(condition.equals("condition3")) {
			condition3.click();
		} else if(condition.equals("condition4")) {
			condition4.click();
		} 
	}

}
