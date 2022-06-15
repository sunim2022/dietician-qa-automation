package stepdefinitions.mypatients;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.ConfirmConditionsAndCreatePlanPage;
import com.dietician.pages.DieticianHomePage;
import com.dietician.pages.MyPatientsPage;
import com.dietician.pages.SimpleLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfirmHealthConditionsSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	
	@Then("Dietician should see action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report\\/ Plan")
	public void dietician_should_see_action_buttons_for_view_previous_test_report_view_previous_diet_plans_create_new_report_plan() {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		assertTrue(patientPage.hasDietPlansButton());
		assertTrue(patientPage.hasNewReportOrPlanButton());
		assertTrue(patientPage.hasPreviousTestResultsButton());
	}

	@Then("Dietician should see only Create New Report\\/ Plan action button.")
	public void dietician_should_see_only_create_new_report_plan_action_button() {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		assertFalse(patientPage.hasDietPlansButton());
		assertTrue(patientPage.hasNewReportOrPlanButton());
		assertFalse(patientPage.hasPreviousTestResultsButton());
	}

	@When("Dietician clicks on {string} button for one of the patients from the list.")
	public void dietician_clicks_on_button_for_one_of_the_patients_from_the_list(String action) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		if(action == "CREATE NEW REPORT/PLAN") {
			patientPage.clickOn_newReportOrPlanBtn();
		}
	}

	@Then("Dietician should be navigated to {string} Page .")
	public void dietician_should_be_navigated_to_page(String string) {
		
		ConfirmConditionsAndCreatePlanPage page = new ConfirmConditionsAndCreatePlanPage(driver);
		assertTrue(page.getPageTitle().equals("Confirm Conditions and Create Plan")); 
	    
	}

	@Given("Dietician is on the {string} Page")
	public void dietician_is_on_the_page(String string) {
		SimpleLoginPage loginPage = new SimpleLoginPage(driver);
		loginPage.clickOn_signInBtn();
		
		DieticianHomePage home = new DieticianHomePage(driver);
		home.clickOn_myPatients();	
		
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		patientPage.clickOn_searchBtn();
		
		patientPage.clickOn_newReportOrPlanBtn();
		
		ConfirmConditionsAndCreatePlanPage page = new ConfirmConditionsAndCreatePlanPage(driver);
		assertTrue(page.getPageTitle().equals("Confirm Conditions and Create Plan")); 
	}

	@When("Dietician selects condition1 and condition {int} and clicks on {string}")
	public void dietician_selects_condition1_and_condition_and_clicks_on(Integer int1, String string) {
		ConfirmConditionsAndCreatePlanPage page = new ConfirmConditionsAndCreatePlanPage(driver);
		page.selectCondition("condition1");
		page.selectCondition("condition2");
		page.clickOn_generateMenuBtn();	
		
	}

	@Then("Dietician should stay on the same page and dietician should be able to edit the Conditions and Preferences.")
	public void dietician_should_stay_on_the_same_page_and_dietician_should_be_able_to_edit_the_conditions_and_preferences() {
		ConfirmConditionsAndCreatePlanPage page = new ConfirmConditionsAndCreatePlanPage(driver);
		assertTrue(page.canEditConditions());
		assertTrue(page.canEditPreferences());
		
	}

	@When("Dietician selects condition {int}, clicks on {string}, then clicks on {string} button.")
	public void dietician_selects_condition_clicks_on_then_clicks_on_button(Integer int1, String string, String string2) {
		ConfirmConditionsAndCreatePlanPage page = new ConfirmConditionsAndCreatePlanPage(driver);
		page.selectCondition("condition1");
		page.selectCondition("condition2");
		page.clickOn_confirmBtnOption1();
		page.clickOn_generateMenuBtn();	
	}

	@Then("Dietician should stay on the same page and dietician should not be able to edit the Conditions and Preferences.")
	public void dietician_should_stay_on_the_same_page_and_dietician_should_not_be_able_to_edit_the_conditions_and_preferences() {
		ConfirmConditionsAndCreatePlanPage page = new ConfirmConditionsAndCreatePlanPage(driver);
		assertFalse(page.canEditConditions());
		assertFalse(page.canEditPreferences());
	}

	@When("Dietician selects new value {int} under Conditions and clicks on {string}")
	public void dietician_selects_new_value_under_conditions_and_clicks_on(Integer int1, String string) {
	    //TODO
	}

	@When("Dietician selects new value {int} under Conditions, clicks on {string}, then clicks on {string} button.")
	public void dietician_selects_new_value_under_conditions_clicks_on_then_clicks_on_button(Integer int1, String string, String string2) {
	   //TODO
	}

}
