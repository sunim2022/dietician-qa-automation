package stepdefinitions;



import com.dietician.factory.DriverFactory;
import com.dietician.pages.ListScreensUnderPblcPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListScreensUnderPublicSD extends DriverFactory {
	
	public ListScreensUnderPblcPage ls = new  ListScreensUnderPblcPage ();
	
	@When("user enters screens")
	public void user_clicks_screens() {
		ls.ClickScreens();
	  }

	@Then("User should see a list of screens")
	public void user_should_see_a_list_of_screens() {
	    System.out.println("user navigated to list of screens under public pages");
	}

	@Given("user is on public page")
	public void user_is_on_public_page() {
		String title=ls.PublicPageTitle();
		if(title.equalsIgnoreCase( title)) {
			System.out.println("User is on public page");
		}
		else {
	    System.out.println("Title of the page  is mismatched ");
		}
	}

	

	@When("User clicks sign in")
	public void user_clicks_sign_in() {
	    ls.ClickUserSignIn();
	}

	@Then("user navigates to  sign in page")
	public void user_navigates_to_sign_in_page() {
	   System.out.println("User navigated to sign in page");
	}
	@Then("user navigates to register page")
	public void user_navigates_to_register_page() {
		System.out.println("User navigated to register page");
	}
	@Given("user navigated to public page")
	public void user_navigated_to_public_page() {
		ls.getPublicSelect();
		
	    
	}

	@Given("user should be on public page")
	public void user_should_be_on_public_page() {
	   
	}

	@When("user clicks Team")
	public void user_clicks_team() {
	   ls.clickteam();
	   System.out.println("User should see team page");
	 
	}

	@Then("user navigates to Team page")
	public void user_navigates_to_team_page() {
	   
	}

	@Given("user is on screens page")
	public void user_is_on_screens_page() {
		
	}

	@When("user clicks Testimonials")
	public void user_clicks_testimonials() {
		ls.clicktestimonials();
		
	    
	}

	@Then("user navigated to Testimonials page")
	public void user_navigated_to_testimonials_page() {
	   System.out.println("user navigated to Testimonials page");
	}




}
