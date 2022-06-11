package stepdefinitions.mypatients;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PdfFileSteps {
	
	@Given("User is on {string} page")
	public void user_is_on_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("When user clicks on {string}")
	public void when_user_clicks_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("PDF is opened in proper readable format")
	public void pdf_is_opened_in_proper_readable_format() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("User has clicked view PDF button")
	public void user_has_clicked_view_pdf_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User is on PDF")
	public void user_is_on_pdf() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("PDF has patients details like patient ID, name, email, address, phone number,")
	public void pdf_has_patients_details_like_patient_id_name_email_address_phone_number() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("PDF has doctor details like doc ID, doctor name, email address, clinic\\/facility name, doctor's specialization")
	public void pdf_has_doctor_details_like_doc_id_doctor_name_email_address_clinic_facility_name_doctor_s_specialization() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("PDF shows list of conditions, preferences list, Co-morbidites")
	public void pdf_shows_list_of_conditions_preferences_list_co_morbidites() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("PDF shows diet menu for {int} days, any warning and comments mentioned by doctor.")
	public void pdf_shows_diet_menu_for_days_any_warning_and_comments_mentioned_by_doctor(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
