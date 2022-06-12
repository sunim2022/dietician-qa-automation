package stepdefinitions.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DieticianHomePage {

	//Driver reference
		private WebDriver driver;
		
		//Define all elements of this page
		
		@FindBy(how = How.CSS, css = ".home")
		private WebElement homeTab;
		
		@FindBy(how = How.CSS, css = ".myPatients")
		private WebElement myPatientsTab;
		
		@FindBy(how = How.CSS, css = ".newPatient")
		private WebElement newPatientTab;
		
		@FindBy(how = How.CSS, css = ".dietPlans")
		private WebElement dietPlansTab;
		
		@FindBy(how = How.CSS, css = ".signOutBtn")
		private WebElement signOutBtn;
		

		public DieticianHomePage(WebDriver driver) {		
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}		
		
		public void clickOn_myPatients() {
			myPatientsTab.click();
		}
		
		public void clickOn_newPatient() {
			newPatientTab.click();
		}
		
		public void clickOn_dietPlan() {
			dietPlansTab.click();
		}
		
		public void clickOn_signOut() {
			signOutBtn.click();
		}
		
		public boolean isMyPatientsTabActive() {
			
			if(myPatientsTab.isEnabled()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean isNewPatientTabActive() {
			
			if(newPatientTab.isEnabled()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean isDietPlansTabActive() {
			
			if(dietPlansTab.isEnabled()) {
				return true;
			} else {
				return false;
			}
		}
}
