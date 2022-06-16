package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.ListScreensUnderDietPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListScreensUnderDieticianSD extends DriverFactory {

	WebDriver driver = DriverFactory.getDriver();

	private ListScreensUnderDietPage ld = new ListScreensUnderDietPage(driver);

	@When("User clicks {int} horizontal lines on top right corner")
	public void user_clicks_horizontal_lines_on_top_right_corner(Integer int1) {
		// ld.user_clicks_horizontal_lines_on_top_right_corner(int1); ;
	}

	@Then("user navigated to list of screens under {string}")
	public void user_navigated_to_list_of_screens_under(String string) {
		// ld.user_navigated_to_list_of_screens_under(string);
		// ld.user_navigated_to_list_of_screens_under(string);
	}

	@Then("user should see a link  {string}")
	public void user_should_see_a_link(String string) {
		// ld.user_navigated_to_list_of_screens_under(string);

	}

	@When("User selects the link \"View Recent diets \"before signing in")
	public void user_selects_the_link_view_recent_diets_before_sign_in() {
		WebElement viewRecentDiets = null;
		Select select = new Select(viewRecentDiets);
		select.selectByIndex(0);
		// ld.user_selects_the_link_view_recent_diets_before_sign_in();
	}

	@Then("user is re directed to Sign in page")
	public void user_is_directed_to_sign_in_page() {

	}

	@When("User selects the link \" View Recent Test Reports \"before signing in")
	public void user_selects_the_link_view_recent_test_reports_before_signing_in() {
		// ld.user_is_re_directed_to_view_recent_test_reports_page();
	}

	@Then("user is redirected to sign in page")
	public void user_is_redirected_to_sign_in_page() {
		System.out.println("signin page should be displayed");
	}

	@Given("User is on Dietician page after signing in")
	public void user_is_on_dietician_page_after_signing_in() {
		String title = ld.DieticianPageTitle();
		if (title.equalsIgnoreCase(title)) {
			System.out.println("User is on public page");
		} else {
			System.out.println("Title of the page  is mismatched ");
		}
	}

	private String DieticianPageTitle() {

		return null;
	}

	@When("User selects the link  {string} after signing in")
	public void user_selects_the_link_after_signing_in(String string) {
		// ld.user_is_re_directed_to_view_recent_test_reports_page();
	}

	@Then("user is re directed to View Recent Test Reports page")
	public void user_is_re_directed_to_view_recent_test_reports_page() {

	}

	@When("User selects the link  {string} before signing in")
	public void user_selects_before_signing_in(String string) {
		// ld.user_is_re_directed_to_add_new_patient_page();
	}

	@Then("user is re directed to Add New Patient page")
	public void user_is_re_directed_to_add_new_patient_page() {
		System.out.println("successfully re dircted to add new patient ");

	}

	@When("User selects the link {string} before signing in")
	public void user_selects_the_link_before_signing_in(String string) {
		//ld.user_is_re_directed_to_dietician_home_page();
	}

	@Then("user is re-directed to Dietician Home page")
	public void user_is_re_directed_to_dietician_home_page() {

	}

	@Then("user is re directed to sign in page")
	public void user_is_re_directed_to_sign_in() {
	}

	@Then("user is re directed to My Patients page")
	public void user_is_re_directed_to_my_patients_page() {
		//ld.user_is_re_directed_to_my_patients_page();
	}

	@Then("user is re-directed to Sign In page")
	public void user_is_re_directed_to_sign_in_page() {

	}

	@Given("User is on My Patients page after signing in")
	public void user_is_on_my_patients_page_after_signing_in() {
		//ld.user_is_re_directed_to_my_patients_page();

	}

	@When("User selects the link   \"Confirm Conditions and Create Plan \"after signing in")
	public void user_selects_the_link_confirm_conditions_and_create_plan_after_signing_in() {
		//ld.user_is_re_directed_to_confirm_conditions_and_create_plan();
	}

	@Then("user is re-directed to  Confirm Conditions and Create plan")
	public void user_is_re_directed_to_confirm_conditions_and_create_plan() {
		System.out.println("confirm conditions and plan should be displayed");
	}
}