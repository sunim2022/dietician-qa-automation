package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ListScreensUnderPblcPage {
       WebDriver driver;
       
       @FindBy(id="SelectedPublic") WebElement PublicDropdown;

      
    @FindBy(linkText="UserSignIn")WebElement UserSignInDropdown;
    @FindBy(id="register")WebElement register;
    @FindBy(id="Team")WebElement Team;
   	@FindBy(id="Testimonials")WebElement Testimonials;
   	@FindBy(id="forgotpassword")WebElement Forgotpassword;
   	@FindBy(id="productfeatures")WebElement productfeatures;
   	@FindBy(name="Contact")WebElement Contact;
   	@FindBy(name="Blog")WebElement blog;
   	@FindBy(name="Featuredcontent")WebElement Featuredcontent;
   	@FindBy(id="home")WebElement home;
   	@FindBy(className="screens")WebElement Screens;
  

       public  void ListScreensUnderPublic(WebDriver driver) {
    	   
   		PageFactory.initElements(driver, this);
   		
   	}
       public String PublicPageTitle()
   	{
   		return driver.getTitle();
   	}
       public void ClickScreens() {
    	   Screens.click();
       }
       public Select getPublicSelect() {
           return new Select(PublicDropdown);
           
         } 
       public Select getUserSignInSelect() {
    	   return new Select(UserSignInDropdown);
   	}
       public void ClickUserSignIn() {
    	   UserSignInDropdown.click();;
       }
       public Select getregisterSelect() {
    	   return new Select(register);
   	}
   	public void clickregister() {
   		register.click();
   		
   	}
    public Select getTeamSelect() {
 	   return new Select(Team);
	}
   	public void clickteam() {
   		Team.click();
   	}
    public Select getTestimonialsSelect() {
 	   return new Select(Testimonials);
	}
   	public void clicktestimonials() {
   		Testimonials.click();

   	}
    public Select getForgotpasswordSelect() {
 	   return new Select(Forgotpassword);
	}
   	public void clickforgotpassword() {
		Forgotpassword.click();
	}
    public Select getproductfeaturesSelect() {
 	   return new Select(productfeatures);
	}
	public void clickproductfeatures() {
		productfeatures.click();
	}
	 public Select getContactSelect() {
  	   return new Select(Contact);
 	}
	public void clickcontact() {
		Contact.click();
	}
	 public Select getBlogSelect() {
  	   return new Select(blog);
 	}
	 
	public void clickblog() {
		blog.click();
}
	 public Select getFeaturedContentSelect() {
  	   return new Select(Featuredcontent);
 	}
	public void clickfeaturedcontent() {
		Featuredcontent.click();
	}
	 public Select getHomeSelect() {
  	   return new Select(home);
 	}
	public void clickhome() {
		home.click();
	}
	
	}