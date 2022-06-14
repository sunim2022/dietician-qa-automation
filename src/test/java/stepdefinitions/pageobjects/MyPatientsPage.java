package stepdefinitions.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyPatientsPage {
	
	
	//Define all elements of this page
	
	@FindBy(how = How.CSS, css = ".name")
	private WebElement nameFilter;
	
	@FindBy(how = How.CSS, css = ".email")
	private WebElement emailFilter;
	
	@FindBy(how = How.CSS, css = ".phone")
	private WebElement phoneFilter;
	
	@FindBy(how = How.CSS, css = ".searchBtn")
	private WebElement searchButton;
	
	@FindBy(how = How.XPATH, xpath = "xpath_to_my_patient_breadcrumb")
	private WebElement breadCrumbMyPatient;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_page_Title")
	private WebElement pageTitle;
	
	@FindBy(how=How.XPATH, xpath="xpath_to_my_patient_display_rows")
	private List<WebElement> displayRows;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col1")
	private WebElement tableColHeaderRecordNum;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col2")
	private WebElement tableColHeaderCustId;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col3")
	private WebElement tableColHeaderName;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col4")
	private WebElement tableColHeaderDetails;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col5")
	private WebElement tableColHeaderLastVisit;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col6")
	private WebElement tableColHeaderActions;
	
	@FindBy(how=How.NAME, xpath = "test_reports_name_row_number")
	private WebElement viewTestReports;
	
	@FindBy(how=How.NAME, xpath = "diet_plans_name_row_number")
	private WebElement viewDietPlans;
	
	@FindBy(how=How.NAME, xpath = "new_report_name_row_number")
	private WebElement newReportOrPlan;
	

	public MyPatientsPage(WebDriver driver) {		
		PageFactory.initElements(driver, this);
	}
	
	
	public void enter_name(String name) {
		nameFilter.sendKeys(name);
	}
	
	public void enter_email(String email) {
		nameFilter.sendKeys(email);
	}
	
	public void enter_phone(String phone) {
		nameFilter.sendKeys(phone);
	}
	
	public void clickOn_searchBtn() {
		searchButton.click();
	}
	
	public void clickOn_viewTestReportsBtn() {
		searchButton.click();
	}
	
	public void clickOn_viewDietPlansBtn() {
		searchButton.click();
	}
	
	public void clickOn_newReportOrPlanBtn() {
		searchButton.click();
	}
	
	public boolean isUserOnMyPatientsPage() {
		
		if(breadCrumbMyPatient.getText().equals("Dietician Software / My Patients")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String getPageTitle() {
		
		String title = pageTitle.getText();
		return title;
	}
	
	public boolean foundPatientInformation() {
		
		if(displayRows.size() > 1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean noPatientInformationFound() {
		
		if(displayRows.size() == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean hasAllTableColums() {
		
		if(tableColHeaderRecordNum.isDisplayed() 
				&& tableColHeaderCustId.isDisplayed()
				&& tableColHeaderName.isDisplayed()
				&& tableColHeaderDetails.isDisplayed()
				&& tableColHeaderLastVisit.isDisplayed()
				&& tableColHeaderActions.isDisplayed()) {
			return true;
		} else {
			return false;
		}			
		
	}
	
	public boolean hasPreviousTestResultsButton() {
		
		if(viewTestReports.isDisplayed() && viewTestReports.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean hasDietPlansButton() {
		
		if(viewDietPlans.isDisplayed() && viewDietPlans.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean hasNewReportOrPlanButton() {
		
		if(newReportOrPlan.isDisplayed() && newReportOrPlan.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}
}
