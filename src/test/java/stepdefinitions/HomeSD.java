package stepdefinitions;

import org.testng.Assert;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.ContactUsPage;
import com.dietician.pages.DoctorsTeam;
import com.dietician.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSD {

	HomePage hp = new HomePage(DriverFactory.getDriver());
	DoctorsTeam dt = new DoctorsTeam(DriverFactory.getDriver());
	ContactUsPage cp = new ContactUsPage(DriverFactory.getDriver());

	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		System.out.println("user_is_on_the_browser");
	}

	@When("User opens the Dietician Website")
	public void user_opens_the_dietician_website() {
		System.out.println("user_opens_the_dietician_website");
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String string) {
		System.out.println("user_should_see_the_title_of_the_page_as");
		Assert.assertEquals(true, hp.getHomePageTitle().equals(string));
	}		

	@Then("User should see a logo image with the company name on the Home Page")
	public void user_should_see_a_logo_image_with_the_company_name_on_the_home_page() {
		System.out.println("user_should_see_a_logo_image_with_the_company_name_on_the_home_page");
		Assert.assertEquals(true, hp.isLogoImageDisplayed());
	}

	@Then("User should see a tab with text {string} on the top menu bar of the Home page")
	public void user_should_see_a_tab_with_text_on_the_top_menu_bar_of_the_home_page(String string) {
		System.out.println("user_should_see_a_tab_with_text_on_the_top_menu_bar_of_the_home_page");
		Assert.assertEquals(true, hp.isProductTabDisplayed());
		Assert.assertEquals(true, hp.isClientTabDisplayed());
		Assert.assertEquals(true, hp.isTeamsTabDisplayed());
		Assert.assertEquals(true, hp.isRegisterTabDisplayed());
		Assert.assertEquals(true, hp.isAboutUsTabDisplayed());
		Assert.assertEquals(true, hp.isFeaturesTabDisplayed());
		Assert.assertEquals(true, hp.isBlogsTabDisplayed());
	}
	@Then("User should see a tab with text {string} on the bottom menu bar of the Home page")
	public void user_should_see_a_tab_with_text_on_the_bottom_menu_bar_of_the_home_page(String string) {
		System.out.println("user_should_see_a_tab_with_text_on_the_bottom_menu_bar_of_the_home_page");

		Assert.assertEquals(true, hp.isAboutUsTabDisplayed());
		Assert.assertEquals(true, hp.isFeaturesTabDisplayed());
		Assert.assertEquals(true, hp.isBlogsTabDisplayed());
		Assert.assertEquals(true, hp.isContactUsTabDisplayed());

	}

	@Then("User should see a search option symbol  on the bottom menu bar of the Home page")
	public void user_should_see_a_search_option_symbol_on_the_bottom_menu_bar_of_the_home_page() {
		hp.isSearchDisplayed();
	}

	@Then("User should see a Signin option next to the search button on the bottom menu bar of the Home page")
	public void user_should_see_a_signin_option_next_to_the_search_button_on_the_bottom_menu_bar_of_the_home_page() {
		hp.isSignInDisplayed();
	}

	
	@Given("User is on Home page")
	public void user_is_on_home_page() {
		System.out.println("user_is_on_home_page");
	}

	@When("User clicks on PRODUCT Link on Home Page")
	public void user_clicks_on_product_link_on_home_page() {
		hp.clickProduct();
	}

	@Then("User is re-directed to  Product Page")
	public void user_is_re_directed_to_product_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("PRODUCT"));
	}

	//Team link test
	@When("User clicks on Team Link on Home Page")
	public void user_clicks_on_team_link_on_home_page() {
		hp.clickTeamsLink();
	}

	@Then("User is directed to Doctor Team page")
	public void user_is_directed_to_doctor_team_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("DoctorsTeam"));
	}

	//Client link test
	@When("User clicks on Client link on Home Page")
	public void user_clicks_on_client_link_on_home_page() {
		hp.clickClientLink();
	}

	@Then("User is re-directed to  Client Testimonial Page")
	public void user_is_re_directed_to_client_testimonial_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("Clients"));
	}

	//Pagination of doctors team page TCs
	
	@Given("User is on Dietician Website")
	public void user_is_on_dietician_website() {

	}

	@When("User lands on Teams page")
	public void user_lands_on_teams_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("Teams"));

	}

	@Then("User sees Doctor's name on Doctor team page")
	public void user_sees_doctor_s_name_on_doctor_team_page() {
		Assert.assertEquals(true, dt.isDoctorsNameDisplayed());
	}

	@Then("User should see default Doctor doc1 on first Page")
	public void user_should_see_default_doctor_doc1_on_first_page() {
		Assert.assertEquals(true, dt.isDefaultDoctorPresent("doc1"));
	}

	@Then("User should see default Doctor doc2 on first Page")
	public void user_should_see_default_doctor_doc2_on_first_page() {
		Assert.assertEquals(true, dt.isDefaultDoctorPresent("doc2"));
	}

	@Then("User should see default Doctor doc3 on first Page")
	public void user_should_see_default_doctor_doc3_on_first_page() {
		Assert.assertEquals(true, dt.isDefaultDoctorPresent("doc3"));
	}

	@Given("User is on first page of Team")
	public void user_is_on_first_page_of_team() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("Teams"));
	}

	@When("User clicks on next button\\(>)")
	public void user_clicks_on_next_button() {
		dt.clickNxtButton();
	}

	@Then("User should be directed to next Doctor on Team Page")
	public void user_should_be_directed_to_next_doctor_on_team_page() {
		Assert.assertEquals(true, !dt.isPrevBtnDisabled());
	}

	@Given("User is on Team page")
	public void user_is_on_team_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("Teams"));
	}

	@When("User lands on last page of Team")
	public void user_lands_on_last_page_of_team() {
		Assert.assertEquals(true, dt.isNextBtnDisabled());
	}

	@Then("Next button should be disabled")
	public void next_button_should_be_disabled() {
		Assert.assertEquals(true, dt.isNextBtnDisabled());
	}

	@When("User lands on first page of Team")
	public void user_lands_on_first_page_of_team() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("Teams"));
	}

	@Then("Previous button\\(<)should be disabled")
	public void previous_button_should_be_disabled() {
		Assert.assertEquals(true, dt.isPrevBtnDisabled());
	}

	@Given("User is on second page of Team")
	public void user_is_on_second_page_of_team() {
		Assert.assertEquals(true, !dt.isPrevBtnDisabled());
		Assert.assertEquals(true, !dt.isNextBtnDisabled());
	}

	@When("User clicks on previous button\\(<)")
	public void user_clicks_on_previous_button() {
		dt.clickPrevButton();
	}

	@Then("User should be directed to previous page of Team")
	public void user_should_be_directed_to_previous_page_of_team() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("Home"));
	}

	//Register link 
	@When("User clicks on REGISTER Link on Home Page")
	public void user_clicks_on_register_link_on_home_page() {
		hp.clickRegisterLink();
	}

	@Then("User is directed to Register page")
	public void user_is_directed_to_register_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("REGISTER"));
	}

	//ABOUT link

	@When("User clicks on About Link on Home page")
	public void user_clicks_on_about_link_on_home_page() {
		hp.clickAboutUsLink();
	}

	@Then("User is directed to About Page")
	public void user_is_directed_to_about_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("ABOUT"));
	}

	//Feature link
	@When("User clicks on Featured link")
	public void user_clicks_on_featured_link() {
		hp.clickFeatureLink();
	}

	@Then("User is directed to Featured content page")
	public void user_is_directed_to_featured_content_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("FEATURED CONTENT"));
	}


	//Blog link
	@When("User clicks on Blogs link")
	public void user_clicks_on_blogs_link() {
		hp.clickBlogsLink();
	}

	@Then("User is directed to Blogs Page")
	public void user_is_directed_to_blogs_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("BLOGS"));
	}

	//Contact us link
	@When("User clicks on  Contact us link")
	public void user_clicks_on_contact_us_link() {
		hp.clickContactUsLink();
	}

	@Then("User is directed to Contact us Page")
	public void user_is_directed_to_contact_us_page() {
		Assert.assertEquals(true, DriverFactory.getDriver().getTitle().equals("CONTACT US"));
	}

	//Data fileds on Contact us Page

	@Given("User is on Contact Us Page")
	public void user_is_on_contact_us_page() {
		hp.clickContactUsLink();
	}

	@When("User enters first name with some numeric values")
	public void user_enters_first_name_with_some_numeric_values() {
		cp.setFirstName("1234");
	}

	@When("other fields with valid values")
	public void other_fields_with_valid_values() {
		cp.setLastName("lastName");
		cp.setSubject("valid subject");
		cp.setWriteyourmsgheretext("Here is my text ");
	}

	@When("clicks submit button")
	public void clicks_submit_button() {
		cp.clickSubmit();
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		Assert.assertEquals(true, DriverFactory.getDriver().switchTo().alert().getText().equalsIgnoreCase(string));
	}

	@When("User enters Last  Name field with some numeric values")
	public void user_enters_last_name_field_with_some_numeric_values() {
		cp.setLastName("1234");
	}

	@When("User enters Email with some image values")
	public void user_enters_email_with_some_image_values() {
		cp.setEmail("123");
	}

	@When("other fields with valid values And click submit button")
	public void other_fields_with_valid_values_and_click_submit_button() {
		other_fields_with_valid_values();
		clicks_submit_button();
	}

	@When("User enters Subject with some numeric values")
	public void user_enters_subject_with_some_numeric_values() {
		cp.setSubject("123");
	}

	@When("User enters {string} with some numeric values")
	public void user_enters_with_some_numeric_values(String string) {
		cp.setWriteyourmsgheretext("123");
	}

	@When("User enters all valid values in fields")
	public void user_enters_all_valid_values_in_fields() {
		other_fields_with_valid_values();
	}
}
