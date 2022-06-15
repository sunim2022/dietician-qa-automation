package stepdefinitions.mypatients;

import com.dietician.factory.DriverFactory;
import com.dietician.pages.NewPatientPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewPatientSD  {
	private NewPatientPage np = new NewPatientPage(DriverFactory.getDriver());

	@Given("User is on NewPatientPage")
	public void user_is_on_dietician_website() {
		String title = np.NewPageTitle();
		if(title.equalsIgnoreCase("Patient Data"))
		{
			//System.out.println("User is on New Patient page");
		}
		else
		{
			//System.out.println("Title of the page is mismatched");
		}


	}

	@When("Enters {string} and {string} and {string} and {string} and {string} and {string} and {int} and {string} and {int}")
	public void entersNewPatientDetails(String Fullname1, String AddressLane11, String AddressLane21, String Country1, String City,
			String StateProvinenceorRegion1,int PostalCode1, String Email, int Phonenumber1)
	{
		np.enterFullname(Fullname1);
		np.enterAddressLane1(AddressLane11);
        np.enterAddressLane2(AddressLane21);
		np.enterCountry( Country1);
		np.enterCity(City);
		np.enterSteteProvinenceorRegion( StateProvinenceorRegion1);
		np.enterPostalCode( PostalCode1);
		np.enterPatientEmail( Email);
		np.enterPhoneNumber( Phonenumber1);

	}

   @And("user click on Update button ")
	public void user_clicks_UpDate_Button() {
		np.Click_UPDateNewPatient();

	}

	@Then("PatientRecord Created")
	public void Message_Display_NeW_Patient_Record() {
		np.Confirm_NewPatient_Record();
	}
	
	 //Scenario: PataientData is visible
	    @Given ("User is on NewPatientPage and Created NewPatient Record")
	    @When ("User clicks Clickshere")
	    @Then ("UpdateHealthConditions form should open")
	    public void Message_Display_NeW_Patient_HealthUpdate() {
			np.Confirm_NewPatientHealth_Update();
}}

