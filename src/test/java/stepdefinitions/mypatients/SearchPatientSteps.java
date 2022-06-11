package stepdefinitions.mypatients;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPatientSteps {

	@Then("Name, email and phone number filter options and search button are displayed.")
	public void name_email_and_phone_number_filter_options_and_search_button_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Given("User is logged in")
	public void user_is_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	//TODO: duplicate method
//	@When("User is on my patients")
//	public void user_is_on_my_patients() {
//		// Write code here that turns the phrase above into concrete actions
//		//throw new io.cucumber.java.PendingException();
//	}

	@Then("Button used for search has text as {string}")
	public void button_used_for_search_has_text_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		////throw new io.cucumber.java.PendingException();
	}

	@Given("User is on my patients")
	public void user_is_on_my_patients() {
		// Write code here that turns the phrase above into concrete actions
		////throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search with {string} into name filter box.")
	public void user_clicks_on_search_with_into_name_filter_box(String string) {
		// Write code here that turns the phrase above into concrete actions
		////throw new io.cucumber.java.PendingException();
	}

	@Then("Records for {string} are shown.")
	public void records_for_are_shown(String string) {
		// Write code here that turns the phrase above into concrete actions
		////throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search with {string} into email address filter.")
	public void user_clicks_on_search_with_into_email_address_filter(String string) {
		// Write code here that turns the phrase above into concrete actions
		////throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search with {string} into phone number filter.")
	public void user_clicks_on_search_with_into_phone_number_filter(String string) {
		// Write code here that turns the phrase above into concrete actions
		////throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search button with {string} into name filter box, {string} into phone number filter")
	public void user_clicks_on_search_button_with_into_name_filter_box_into_phone_number_filter(String string,
			String string2) {
		// Write code here that turns the phrase above into concrete actions
		////throw new io.cucumber.java.PendingException();
	}

	@Then("Records for {string} and {string} are shown.")
	public void records_for_and_are_shown(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		////throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search button with {string} into name filter box, {string} into email address filter box")
	public void user_clicks_on_search_button_with_into_name_filter_box_into_email_address_filter_box(String string,
			String string2) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search button with {string} into phone number filter box, {string} into email address filter box")
	public void user_clicks_on_search_button_with_into_phone_number_filter_box_into_email_address_filter_box(
			String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Given("User is on my patients page")
	public void user_is_on_my_patients_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("User types in anything other than numbers in phone number field")
	public void user_types_in_anything_other_than_numbers_in_phone_number_field() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Then("It must throw error message and discontinue search action.")
	public void it_must_throw_error_message_and_discontinue_search_action() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("User types in anything other valid character in email address field")
	public void user_types_in_anything_other_valid_character_in_email_address_field() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("User types in anything other alphabets in name field")
	public void user_types_in_anything_other_alphabets_in_name_field() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search button with all fields empty")
	public void user_clicks_on_search_button_with_all_fields_empty() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Displays all patients for that dietician only")
	public void displays_all_patients_for_that_dietician_only() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search button with or without all fields empty")
	public void user_clicks_on_search_button_with_or_without_all_fields_empty() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Then("It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions")
	public void it_shows_columns_name_like_record_number_cust_id_name_details_last_visit_and_actions() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Then("It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report\\/ Plan")
	public void it_shows_action_buttons_for_view_previous_test_report_view_previous_diet_plans_create_new_report_plan() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
}
