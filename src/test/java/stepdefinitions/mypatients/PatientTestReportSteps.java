package stepdefinitions.mypatients;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.DieticianHomePage;
import com.dietician.pages.MyPatientsPage;
import com.dietician.pages.PatientTestReportPage;
import com.dietician.pages.PdfPage;
import com.dietician.pages.SimpleLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientTestReportSteps {

	private WebDriver driver = DriverFactory.getDriver();
	
	@Given("Dietician is on the \"My Patients\"page.")
	public void dietician_is_on_the_my_patients_page() {
	    
		SimpleLoginPage loginPage = new SimpleLoginPage(driver);
		loginPage.clickOn_signInBtn();
		
		DieticianHomePage home = new DieticianHomePage(driver);
		home.clickOn_myPatients();	 		
		
	}

	@When("Dietician clicks on Search button without entering any filter text fields.")
	public void dietician_clicks_on_search_button_without_entering_any_filter_text_fields() {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		patientPage.clickOn_searchBtn();
	}

	@When("Dietician clicks on {string} button for one of the patients from the list")
	public void dietician_clicks_on_button_for_one_of_the_patients_from_the_list(String action) {
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		if(action == "VIEW PREVIOUS TEST REPORTS") {
			patientPage.clickOn_viewTestReportsBtn();
		}
	}

	@Then("Dietician should be navigated to {string} Page")
	public void dietician_should_be_navigated_to_page(String string) {
		PatientTestReportPage patientTestReportPage = new PatientTestReportPage(driver);
		assertTrue(patientTestReportPage.getPageTitle().equals("View Patient Test Reports"));	   
	}

	@Then("Dietician should be navigated to {string} Page and Dietician should see the Patient info \\(Patient ID, Name, and details)")
	public void dietician_should_be_navigated_to_page_and_dietician_should_see_the_patient_info_patient_id_name_and_details(String string) {
		PatientTestReportPage patientTestReportPage = new PatientTestReportPage(driver);
		assertNotNull(patientTestReportPage.getPatientEmail());
		assertNotNull(patientTestReportPage.getPatientID());
		assertNotNull(patientTestReportPage.getPatientName());
		assertNotNull(patientTestReportPage.getPatientPhoneNum());
	}

	@Then("Dietician should be navigated to {string} Page and Dietician should see the list of Test Reports with Record Number, DOC -ID, FILE ,Uploaded Time, File\\/Report Name, Identified Health Conditions columns.")
	public void dietician_should_be_navigated_to_page_and_dietician_should_see_the_list_of_test_reports_with_record_number_doc_id_file_uploaded_time_file_report_name_identified_health_conditions_columns(String string) {
	    
		PatientTestReportPage patientTestReportPage = new PatientTestReportPage(driver);
		assertTrue(patientTestReportPage.hasAllTableColums());		
	}
	
	
	@Given("Dietician is on the {string} page.")
	public void dietician_is_on_view_reports_page(String string) {
		PatientTestReportPage patientTestReportPage = new PatientTestReportPage(driver);
		assertTrue(patientTestReportPage.getPageTitle().equals("View Patient Test Reports"));	 
	}

	@When("Dietician clicks on {string} button for the latest test report")
	public void dietician_clicks_on_button_for_the_latest_test_report(String string) {
		PatientTestReportPage patientTestReportPage = new PatientTestReportPage(driver);
		assertTrue(patientTestReportPage.hasPdfReportButtonEnabled());
		patientTestReportPage.clickOn_pdfBtn();
		
	}

	@Then("Dietician should see the pdf file opened with content.")
	public void dietician_should_see_the_pdf_file_opened_with_content() throws Exception {
		PdfPage pdfPage = new PdfPage(driver);
		assertTrue(pdfPage.hasPdfExtensionInURL());
		assertTrue(pdfPage.verifyPDFContent("7-day menu"));
		assertTrue(pdfPage.verifyPDFContent("warning"));
		assertTrue(pdfPage.verifyPDFContent("comments"));
		assertTrue(pdfPage.verifyPDFContent("Conditions"));
		assertTrue(pdfPage.verifyPDFContent("co-morbidities"));
	}

}
