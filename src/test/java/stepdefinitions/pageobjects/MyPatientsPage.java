package stepdefinitions.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyPatientsPage {
	
	//Driver reference
	private WebDriver driver;
	
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

	public MyPatientsPage(WebDriver driver) {		
		this.driver = driver;
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
}
