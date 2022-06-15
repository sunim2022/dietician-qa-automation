package stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.ConfirmConditionsAndCreatePlanPage;
import com.dietician.pages.DieticianHomePage;
import com.dietician.pages.MyPatientsPage;
import com.dietician.pages.PatientTestReportPage;
import com.dietician.pages.SimpleLoginPage;
import com.dietician.pages.ViewRecentDietsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientInformationSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	
	
	@Given("Patients records are displayed")
	public void patients_records_are_displayed() {
		
		SimpleLoginPage loginPage = new SimpleLoginPage(driver);
		loginPage.clickOn_signInBtn();
		
		DieticianHomePage home = new DieticianHomePage(driver);
		home.clickOn_myPatients();	
		
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		patientPage.enter_name("testName");
		patientPage.clickOn_searchBtn();	   
	}

	@When("User clicks on button {string}")
	public void user_clicks_on_button(String action) {
		
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		if(action == "View Previous Diet Plans") {
			patientPage.clickOn_viewDietPlansBtn();
			
		} else if(action == "Create New Report Plan") {
			patientPage.clickOn_newReportOrPlanBtn();
			
		} else if(action == "View Previous Test Reports") {
			patientPage.clickOn_viewTestReportsBtn();
		}
	   
	}

	@Then("It redirects user to {string} page")
	public void it_redirects_user_to_page(String title) {
		
		if(title == "Generated Diet Plans") {
			ViewRecentDietsPage dietsPage = new ViewRecentDietsPage(driver);
			assertTrue(dietsPage.getPageTitle().equals("Generated Diet Plans"));
			
		} else if(title == "Confirm Health Conditions and Generate a New Diet plan") {
			ConfirmConditionsAndCreatePlanPage conditionsAndCreatePlanPage = new ConfirmConditionsAndCreatePlanPage(driver);
			assertTrue(conditionsAndCreatePlanPage.getPageTitle().equals("Confirm Health Conditions and Generate a New Diet plan"));
			
		} else if(title == "View Patient Test Reports") {
			PatientTestReportPage patientTestReportPage = new PatientTestReportPage(driver);
			assertTrue(patientTestReportPage.getPageTitle().equals("View Patient Test Reports"));
		}
	  
	}

}
