package stepdefinitions.mypatients;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.dietician.factory.DriverFactory;

import stepdefinitions.pageobjects.DieticianHomePage;
import stepdefinitions.pageobjects.MyPatientsPage;
import stepdefinitions.pageobjects.SimpleLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPatientSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	
	@Given("User is on my patients")
	public void user_is_on_my_patients() {
		SimpleLoginPage loginPage = new SimpleLoginPage(driver);
		loginPage.clickOn_signInBtn();
		
		DieticianHomePage home = new DieticianHomePage(driver);
		home.clickOn_myPatients();	 		
	}

	@When("User clicks on search with {string} into name filter box.")
	public void user_clicks_on_search_with_into_name_filter_box(String name) {
		
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		patientPage.enter_name(name);
		patientPage.clickOn_searchBtn();
	}

	@Then("Records for {string} are shown.")
	public void records_for_are_shown(String filterValue) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		assertTrue(patientPage.foundPatientInformation());
	}

	@When("User clicks on search with {string} into email address filter.")
	public void user_clicks_on_search_with_into_email_address_filter(String email) {
	    
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		patientPage.enter_email(email);
		patientPage.clickOn_searchBtn();
	}

	@When("User clicks on search with {string} into phone number filter.")
	public void user_clicks_on_search_with_into_phone_number_filter(String phone) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		patientPage.enter_phone(phone);
		patientPage.clickOn_searchBtn();
	}

	@When("User clicks on search button with {string} into name filter box, {string} into phone number filter")
	public void user_clicks_on_search_button_with_into_name_filter_box_into_phone_number_filter(String name, String phone) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		patientPage.enter_name(name);
		patientPage.enter_phone(phone);
		patientPage.clickOn_searchBtn();
	}

	@Then("Records for {string} and {string} are shown.")
	public void records_for_and_are_shown(String string, String string2) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		assertTrue(patientPage.foundPatientInformation());
	}

	@When("User clicks on search button with {string} into name filter box, {string} into email address filter box")
	public void user_clicks_on_search_button_with_into_name_filter_box_into_email_address_filter_box(String name, String email) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		patientPage.enter_name(name);
		patientPage.enter_email(email);
		patientPage.clickOn_searchBtn();
	}

	@When("User clicks on search button with {string} into phone number filter box, {string} into email address filter box")
	public void user_clicks_on_search_button_with_into_phone_number_filter_box_into_email_address_filter_box(String phone, String email) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		patientPage.enter_phone(phone);
		patientPage.enter_email(email);
		patientPage.clickOn_searchBtn();
	}

	@When("User clicks on search button with all fields empty")
	public void user_clicks_on_search_button_with_all_fields_empty() {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		patientPage.enter_name(null);
		patientPage.enter_phone(null);
		patientPage.enter_email(null);
		patientPage.clickOn_searchBtn();
	}

	@Then("Displays all patients for that dietician only")
	public void displays_all_patients_for_that_dietician_only() {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		assertTrue(patientPage.foundPatientInformation());
	}

	@When("User clicks on search with \"name phrase\" into name filter box")
	public void user_clicks_on_search_button_with_or_without_all_fields_empty() {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		patientPage.enter_name("Joe");
		patientPage.clickOn_searchBtn();
	}

	@Then("It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions")
	public void it_shows_columns_name_like_record_number_cust_id_name_details_last_visit_and_actions() {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		assertTrue(patientPage.hasAllTableColums());
	}

	@Then("It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report\\/ Plan")
	public void it_shows_action_buttons_for_view_previous_test_report_view_previous_diet_plans_create_new_report_plan() {
	    
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		assertTrue(patientPage.hasDietPlansButton());
		assertTrue(patientPage.hasNewReportOrPlanButton());
		assertTrue(patientPage.hasPreviousTestResultsButton());
		
	}

}
