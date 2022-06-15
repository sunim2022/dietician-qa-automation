package stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.DieticianHomePage;
import com.dietician.pages.MyPatientsPage;
import com.dietician.pages.SimpleLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyPatientsPageSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	
//	private WebDriver driver;
//	
//	@BeforeClass
//	public void beforeClass() {
//		
//		//TODO:
//		System.setProperty("webdriver.chrome.driver", "C:/Users/msuni/Software/Drivers/chromedriver_102.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://dietician-dummy-url.com");
//		
//	}
	
	@Given("User is on any page after login")
	public void user_is_on_any_page_after_login() {
		SimpleLoginPage loginPage = new SimpleLoginPage(driver);
		loginPage.clickOn_signInBtn();
	}
	
	@Given("{string} tab is enabled")
	public void tab_is_enabled(String string) {
		DieticianHomePage home = new DieticianHomePage(driver);
		
		boolean actualResult = home.isMyPatientsTabActive();
		
		assertTrue(actualResult);
		
	}


	@When("User clicks on {string} tab")
	public void user_clicks_on_tab(String tabName) {
		
		DieticianHomePage home = new DieticianHomePage(driver);
		
		if(tabName == "My Patients") {
			home.clickOn_myPatients();	 
		} else if(tabName == "New Patient") {
			home.clickOn_newPatient();;	 
		} else if(tabName == "Diet Plans") {
			home.clickOn_dietPlan();	 
		} 
		   
	}

	
	@Then("It shows breadcrubs as Dietician Software\\/ MyPatients")
	public void it_shows_breadcrubs_as_dietician_software_my_patients() {
	    
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		
		boolean actualResult = patientPage.isUserOnMyPatientsPage();
		
		assertTrue(actualResult);
	}

	@Then("Page title is displayed as {string}")
	public void page_title_is_displayed_as(String expectedTitle) {
		
		MyPatientsPage patientPage = new MyPatientsPage(driver);
		 String actualValue = patientPage.getPageTitle();
		 assertEquals(actualValue, expectedTitle);
		
	}
	
	
}
