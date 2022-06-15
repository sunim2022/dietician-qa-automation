package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	WebDriver driver = DriverFactory.getDriver();
	
	@Given("User is on Dietician website")
	public void user_is_on_dietician_website() {
		String title = lp.pageTitle();
		if(title.equalsIgnoreCase("HOME Made with Justinmind"))
		{
			System.out.println("User is on Home page");
		}
			else
			{
			System.out.println("Title of the page is mismatched");
			}	
	}

	@When("User clicks account icon and selects sign in")
	public void user_clicks_account_icon_and_selects_sign_in() {
		   lp.Click_account();
		   lp.select_signin(); 
	}

	@Then("Sign in form should open")
	public void sign_in_form_should_open() {
		String title = lp.pageTitle();
		if(title.equalsIgnoreCase("Home - Login"))
		{
			System.out.println("User is on Home page");
		}
			else
			{
			System.out.println("Title of the page is mismatched");
			}	
		
	}

	@Given("User is on Sign in form")
	public void user_is_on_sign_in_form() {
		String title = lp.pageTitle();
		if(title.equalsIgnoreCase("Home - Login"))
		{
			System.out.println("User is on Home page");
		}
			else
			{
			System.out.println("Title of the page is mismatched");
			}	
		
	    
	}

	@When("Enters {string} and {string}")
	public void enters_and(String username, String Password) {
		
		lp.enterusername(username);
		lp.enteruserpassword(Password);
		System.out.println(username + Password);
		
		
	}

	@When("user click on signin button")
	public void user_click_on_signin_button() {
		lp.clicks_signin();
	 
	}

	@Then("navigates to home page")
	public void navigates_to_home_page() {
	    String title = lp.pageTitle();
	    if (title.equalsIgnoreCase("Home"))
	    {
	    	System.out.println("user is on home page");
	    }
	    else
	    {
	    	System.out.println("Home page title is not matched");
	    }
	}

	@When("user clicks on signin button")
	public void user_clicks_on_signin_button() {
		lp.ClickLogin();
	   
	}

	@When("User clicks Facebook button")
	public void user_clicks_facebook_button() {
		lp.clickfacebook();
	 
	}

	@Then("Facebook username and Password displays in corresponding text box")
	public void facebook_username_and_password_displays_in_corresponding_text_box() {
		String e_text = lp.email_text();
		String p_text= lp.passowrd_text();
				
		if(e_text.isBlank())
		{
			System.out.println("email id not exist");
			
		}
		
		if(p_text.isBlank())
		{
			System.out.println("email id not exist");
			
		}
		
	    
	}
	
	@Then("google username and Password displays in corresponding text box")
	public void google_username_and_password_displays_in_corresponding_text_box() {
		String e_text = lp.email_text();
		String p_text= lp.passowrd_text();
				
		if(e_text.isBlank())
		{
			System.out.println("email id not exist");
			
		}
		
		if(p_text.isBlank())
		{
			System.out.println("email id not exist");
			
		}
		
	   
	}
	
	@Then("User gets popup says Invalid username or password")
	public void user_gets_popup_says_invalid_username_or_password() {
	  String altert_Text = driver.switchTo().alert().getText();
	  if(altert_Text.equalsIgnoreCase("Invalid username or password"))
	  {
		  driver.switchTo().alert().accept();  
	  }
	  else {
		  System.out.println("alert is not displayed");
	  }
	}

	@When("User clicks signin button")
	public void user_clicks_signin_button() {
		
		lp.ClickLogin();
	}

}
