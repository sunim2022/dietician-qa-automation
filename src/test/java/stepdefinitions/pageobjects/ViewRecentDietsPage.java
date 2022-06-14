package stepdefinitions.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewRecentDietsPage {

	@FindBy(how=How.XPATH, xpath = "xpath_to_view_diets_page_Title")
	private WebElement pageTitle;
	
	public ViewRecentDietsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		
		String title = pageTitle.getText();
		return title;
	}

}
