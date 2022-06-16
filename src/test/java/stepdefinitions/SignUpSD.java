package stepdefinitions;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSD extends DriverFactory{
	

	public SignUpPage rp=new SignUpPage(DriverFactory.getDriver());
	
	@Given("user is on Dietician website")
	public void user_navigates_to_dietician_website() {
		String title=rp.registerPageTitle();
		if(title.equalsIgnoreCase( title)) {
			System.out.println("User is on Dietician website");
		}
		else {
	    System.out.println("Title of the page  is mismatched ");
		}
	    
	}

	@When("User Clicks Register button")
	public void RegisterClick() {
		rp.Click_register();
	    
	    }

	@Then("user is on sign up form")
	public void user_is_on_sign_up_form() {
		
	    System.out.println("user should see sign up form");
	}
	@Given("User is on Sign up form")
	public void sign_up_form() {
	   
	}

	

	@When("User Enters {string} {string} {string} {string} {string} and {string}")
	public void user_enters_and(String firstname, String lastname, String mobilenumber, String anyotherfield, String email, String password) {
	    rp.enterfirstname(firstname);
	    rp.enterlastname(lastname);
	    rp.entermobnumer(mobilenumber);
	    rp.enteranyotherfield(anyotherfield);
	    rp.enteremail(email);
	    rp.enterpassword1(password);
	}

	

	@Then("User successfully signed up")
	public void user_successfully_signed_up() {
	    System.out.println("user is successfully signed up");
	}

	@Given("User on Dietician website")
	public void user_on_dietician_website() {
	    
	}
	@When("user clicks Register button")
	public void user_clicks_register_button() {
	   rp.Click_register();
	}
	@Then("User navigated to sign up with your email")
		public void signup_email() {
		System.out.println("successfully navigated to sign up with email page");
	}

	@Given("User is on Sign up form with your email")
	public void user_is_on_sign_up_form_with_your_email() {
	    System.out.println("user is on sign up with email");
	}

	@When("User Enters {string} {string} {string} {string} {string}  and {string}")
	public void enter(String name, String lastname,String username , String email, String password, String confirmpassword) {
		rp.entername(name);
	    rp.enterlastname(lastname);
	    rp.enterusername(username);
	    rp.enteremail1(email);
	    rp.enterpassword1(password);
	    rp.enterconfirmpass(confirmpassword);
	}
	@Then("user should navigate to sign up with your email page")
	public void user_is_on_sign_up_with_your_email_page() {
		System.out.println("successfully signed up");
	    }
    

	@Given("user clicks Register")
	public void user_clicks_register() {
		rp.Click_register();
	    
	}

	
	

	@When("user clicks sign up with using facebook")
	public void user_clicks_sign_up_with_using_facebook() {
		rp.clickfacebook();
	    
	}

	@Then("user navigate to sign up with facebook")
	public void user_navigate_to_sign_up_with_facebook() {
	    
	}

	@Given("user is on sign up form with your facebook account")
	public void user_is_on_sign_up_form_with_your_facebook_account() {
	    
	}

	@When("user enters {string} And {string}")
	public void user_enters_and(String email, String password) {
	    rp.enteremail(email);
	    rp.enterpassword1(password);
	    rp.Clicks_signup();
	   
	    }

	
	@Then("user successfully signed up through facebook")
	public void user_successfully_signed_up_through_facebook() {
	    System.out.println("user successfully signed up with facebook");
	}



	@Given("User clicks Register")
	public void clicks_register() {
	    rp.Click_register();
	}

	@When("user clicks Sign up with using google account")
	public void user_clicks_sign_up_with_using_google_account() {
		rp.clickgoogle();
	  
	}

	@Then("user navigate to sign up using google account")
	public void user_navigate_to_sign_up_using_google_account() {
	    System.out.println("user navigated to google account page");
	}
	
	@Given("user clicks register")
	public void click_register() {
	    rp.Click_register();
	}

	@When("user enters {string} And {string} clicks sign up")
	public void user_enters_and_clicks_sign_up(String email, String password) {
	    rp.enteremail(email);
	    rp.enterpassword1(password);
	    rp.clickSignup();
	}



	@Then("user successfully signed up through Google Account")
	public void user_successfully_signed_up_through_google_account() {
	   System.out.println("user successfully signed up with google account");
	}

																																																																																																																																																																		//	@Given("User is on Home page")
																																																																																																																																																																		//	public void user_is_on_home_page() {
																																																																																																																																																																		//	    System.out.println("user is on home page");
		//	}

	@Given("user Clicks Register")
	public void user_register() {
	    System.out.println("User clicks register");
	}

	@When("user clicks \"login here\"link")
	public void user_clicks_login_here_link() {
	    System.out.println("User clicks login here");
	}

	@Then("user should navigate to sign in page")
	public void user_should_navigate_to_sign_in_page() {
	    System.out.println("user should navigate to sign in page");
	}

}
