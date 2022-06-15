package com.dietician.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewRecentDietsPage {

	@FindBy(how = How.XPATH, xpath = "xpath_to_view_diets_page_Title")
	private WebElement pageTitle;

	/////////////////////////////////////////////////////////

	@FindBy(how = How.XPATH, xpath = "xpath_to_diet_plan_rows")
	private List<WebElement> dietPlanRows;

	@FindBy(how = How.XPATH, xpath = "xpath_to_diet_plan_col1")
	private WebElement tableColHeaderRecordNum;

	@FindBy(how = How.XPATH, xpath = "xpath_to_diet_plan_col2")
	private WebElement tableColHeaderPlanId;

	@FindBy(how = How.XPATH, xpath = "xpath_to_diet_plan_col3")
	private WebElement tableColHeaderCustomerDetails;

	@FindBy(how = How.XPATH, xpath = "xpath_to_diet_plan_col4")
	private WebElement tableColHeaderDietPlan;

	@FindBy(how = How.XPATH, xpath = "xpath_to_diet_plan_col5")
	private WebElement tableColHeaderPlanGeneratedTime;

	@FindBy(how = How.XPATH, xpath = "xpath_to_diet_plan_col6")
	private WebElement tableColHeaderComments;

	@FindBy(how = How.NAME, xpath = "xpath_to_diet_plan_view_pdf_btn_for_1st_row")
	private WebElement viewPDFBtnForFirstRow;

	/////////////////////////////////////////////////////////

	public ViewRecentDietsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {

		String title = pageTitle.getText();
		return title;
	}

	public boolean foundPatientDietPlans() {

		if (dietPlanRows.size() > 1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean noPatientDietPlansFound() {

		if (dietPlanRows.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean hasAllTableColums() {

		if (tableColHeaderRecordNum.isDisplayed() && tableColHeaderPlanId.isDisplayed()
				&& tableColHeaderCustomerDetails.isDisplayed() && tableColHeaderDietPlan.isDisplayed()
				&& tableColHeaderPlanGeneratedTime.isDisplayed() && tableColHeaderComments.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean hasPdfReportButtonEnabled() {

		if (viewPDFBtnForFirstRow.isDisplayed() && viewPDFBtnForFirstRow.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOn_pdfBtn() {
		viewPDFBtnForFirstRow.click();
	}

}
