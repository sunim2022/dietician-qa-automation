package com.dietician.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PatientTestReportPage {

	@FindBy(how=How.XPATH, xpath = "xpath_to_page_Title")
	private WebElement pageTitle;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_patientId")
	private WebElement patientID;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_patientName")
	private WebElement patientName;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_patientPhone")
	private WebElement patientPhoneNum;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_patientEmail")
	private WebElement patientEmail;
	
	/////////////////////////////////////////////////////////
	
	@FindBy(how=How.XPATH, xpath="xpath_to_my_patient_reports_rows")
	private List<WebElement> displayRows;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col1")
	private WebElement tableColHeaderRecordNum;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col2")
	private WebElement tableColHeaderDocId;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col3")
	private WebElement tableColHeaderFile;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col4")
	private WebElement tableColHeaderUploadedTime;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col5")
	private WebElement tableColHeaderFileReportName;
	
	@FindBy(how=How.XPATH, xpath = "xpath_to_my_patient_col6")
	private WebElement tableColHeaderIdentifiedHealthConditions;
	
	@FindBy(how=How.NAME, xpath = "test_reports_view_pdf_btn_for_1st_row")
	private WebElement viewPDFBtnForFirstReport;
	
	
	
	/////////////////////////////////////////////////////////

	
	public PatientTestReportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		
		String title = pageTitle.getText();
		return title;
	}
	
	public String getPatientID() {
		return patientID.getText();		
	}
	
	public String getPatientName() {
		return patientName.getText();
	}
	
	public String getPatientPhoneNum() {
		return patientPhoneNum.getText();
	}

	public String getPatientEmail() {
		return patientEmail.getText();
	}
	
	//////////////////////////////////////////////////////////
	
	public boolean foundPatientTestReports() {
		
		if(displayRows.size() > 1) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean noPatientTestReportsFound() {
		
		if(displayRows.size() == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean hasAllTableColums() {
		
		if(tableColHeaderRecordNum.isDisplayed() 
				&& tableColHeaderDocId.isDisplayed()
				&& tableColHeaderFile.isDisplayed()
				&& tableColHeaderUploadedTime.isDisplayed()
				&& tableColHeaderFileReportName.isDisplayed()
				&& tableColHeaderIdentifiedHealthConditions.isDisplayed()) {
			return true;
		} else {
			return false;
		}			
		
	}
	
	public boolean hasPdfReportButtonEnabled() {
		
		if(viewPDFBtnForFirstReport.isDisplayed() && viewPDFBtnForFirstReport.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}	
	
	public void clickOn_pdfBtn() {
		viewPDFBtnForFirstReport.click();
	}
	
}
