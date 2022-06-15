package stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.DieticianHomePage;
import com.dietician.pages.MyPatientsPage;
import com.dietician.pages.PdfPage;
import com.dietician.pages.SimpleLoginPage;
import com.dietician.pages.ViewRecentDietsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewDietPlansSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	
	@Given("Dietician is on the {string} page")
	public void dietician_is_on_the_page(String string) {
		SimpleLoginPage loginPage = new SimpleLoginPage(driver);
		loginPage.clickOn_signInBtn();
		
		DieticianHomePage home = new DieticianHomePage(driver);
		home.clickOn_myPatients();	 
	}

	@When("Dietician enters a {string}, clicks on Search and clicks on {string} button for first plan.")
	public void dietician_enters_a_clicks_on_search_and_clicks_on_button_for_first_plan(String name, String string2) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		patientPage.enter_name(name);
		patientPage.clickOn_searchBtn();
	}

	@Then("Dietician should be navigated to {string} Page.")
	public void dietician_should_be_navigated_to_page(String string) {
	   ViewRecentDietsPage page = new ViewRecentDietsPage(driver);
	   assertTrue(page.getPageTitle().equals("View Recent Diets"));	   
		
	}

	@When("Dietician clicks on {string} button.")
	public void dietician_clicks_on_button(String buttonName) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		if(buttonName.equals("VIEW PREVIOUS DIET PLANS")) {
			patientPage.clickOn_viewDietPlansBtn();			
		}
	}

	@Then("Dietician should be navigated to {string} Page and Dietician should see Record Number, Plan-ID, Customer Details,Diet Plan, Plan Generated Time and Comments columns.")
	public void dietician_navigates_to_page_and_view_all_rows_with_columns(String string) {
		ViewRecentDietsPage page = new ViewRecentDietsPage(driver);
		assertTrue(page.getPageTitle().equals("View Recent Diets"));
		assertTrue(page.foundPatientDietPlans());
		assertTrue(page.hasAllTableColums());
		   
	}

	@Given("Dietician is on the {string} page and patient has {int} diet plans")
	public void dietician_is_on_the_page_and_patient_has_diet_plans(String string, Integer totalDietPlans) {
	    
		ViewRecentDietsPage page = new ViewRecentDietsPage(driver);
		assertTrue(page.getPageTitle().equals("View Recent Diets"));
		
		//Ideally, get patient data from database who has 0 diet plans.
		//assertTrue(totalDietPlans == 0);		
		
	}

	@Then("Dietician should see zero records in table.")
	public void dietician_should_see_zero_records_in_table() {
		ViewRecentDietsPage page = new ViewRecentDietsPage(driver);
				
		assertTrue(page.noPatientDietPlansFound());
		
	}

	@Given("Dietician is succesfully logged in.")
	public void dietician_is_succesfully_logged_in() {
		SimpleLoginPage loginPage = new SimpleLoginPage(driver);
		loginPage.clickOn_signInBtn();
		
	}

	@When("Dietician clicks on {string} tab.")
	public void dietician_clicks_on_tab(String string) {
		DieticianHomePage home = new DieticianHomePage(driver);
		home.clickOn_dietPlan();
	}

	@When("Dietician clicks on {string} button for the latest diet plan")
	public void dietician_clicks_on_button_for_the_latest_diet_plan(String string) {
	    
		ViewRecentDietsPage page = new ViewRecentDietsPage(driver);
		assertTrue(page.foundPatientDietPlans());
		
		assertTrue(page.hasPdfReportButtonEnabled());
		page.clickOn_pdfBtn();
		
	}
	
	@Then("Dietician should see the pdf file opened with diet content.")
	public void dietician_should_see_the_pdf_file_opened_with_diet_content() throws Exception {
		PdfPage pdfPage = new PdfPage(driver);
		assertTrue(pdfPage.hasPdfExtensionInURL());
		assertTrue(pdfPage.verifyPDFContent("7-day menu"));
		assertTrue(pdfPage.verifyPDFContent("warning"));
		assertTrue(pdfPage.verifyPDFContent("comments"));
		assertTrue(pdfPage.verifyPDFContent("Conditions"));
		assertTrue(pdfPage.verifyPDFContent("co-morbidities"));
	}

}
