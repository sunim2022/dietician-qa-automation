
package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class NewPatientPage{
	WebDriver driver;
	//PageFactory implementation//object repository
	@FindBy(linkText ="Patient Data") WebElement PatientDatatext;
	@FindBy(id="Fullname")WebElement Fullname;
	@FindBy(id="Address Lane1")WebElement AddressLane1;
	@FindBy(id="Address Lane2")WebElement AddressLane2;
	@FindBy(id="Country")WebElement Country;
	@FindBy(id="City")WebElement City;
	@FindBy(id="StateProvinenceorRegion")WebElement StateProvinenceorRegion;
	@FindBy(id="PostalCode")WebElement PostalCode;
	@FindBy(id="PatientEmail")WebElement PatientEmail;//Patient's Email
	@FindBy(id="PhoneNumber")WebElement PhoneNumber;
	@FindBy(xpath = "//input[@class='Update']")WebElement Update;
	@FindBy(linkText ="Update Health Conditions") WebElement UpdateHealthClickhere;
	@FindBy(xpath = "//input[@class='Clickhere']")WebElement Clickhere;
	
	
	public NewPatientPage(WebDriver driver)//Constructor initializing the page objects
	{
		
		PageFactory.initElements(driver, this);//make sure the steps once again
		
		
	}
	public  void retrivePatientDataText(String PatientDatatext1)
	{
		PatientDatatext.sendKeys();			
	}
	
	public  void enterFullname(String Fullname1)
	{
		Fullname.sendKeys();			
	}
	public  void enterAddressLane1(String AddressLane11)
	{
		AddressLane1.sendKeys();			
	}
	public  void enterAddressLane2(String AddressLane21)
	{
		AddressLane2.sendKeys();			
	}
	public  void enterCountry(String Country1)
	{
		Country.sendKeys();			
	}
	public  void enterCity(String City1)
	{
		City.sendKeys();			
	}
	public  void enterSteteProvinenceorRegion(String StateProvinenceorRegion1)
	{
		StateProvinenceorRegion.sendKeys();			
	}
	
	public  void enterPostalCode(int PostalCode1)
	{
		PostalCode.sendKeys();			
	}
	public  void enterPatientEmail(String PatientEmail1)
	{
		PatientEmail.sendKeys();			
	}
	public  void enterPhoneNumber(int PhoneNumber1)
	{
		PhoneNumber.sendKeys();			
	}
	
	public void Click_UpdateHealth() //To Enter Health Conditions of New Patient 
	{
		Clickhere.click();
    }
	public String NewPageTitle() {
		// to get Title of NewPAtient Page
	return	PatientDatatext.getText();
	}
	public void Click_UPDateNewPatient() {
		Update.click();
		// to click perform create new patient record  
	}
	public void Confirm_NewPatient_Record() {
		// System.out.println("New Patient Record Created");
		
	}
	public void Confirm_NewPatientHealth_Update() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

