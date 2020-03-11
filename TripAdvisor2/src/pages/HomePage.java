package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.Data;
import framework.EventMethods;



public class HomePage {
	@FindBy(xpath = "//img[@src='https://static.tacdn.com/img2/langs/en_IN/branding/"
			+ "rebrand/TA_logo_primary_v2.svg']") WebElement HomepageLogo;
	@FindBy(xpath = "//div[@title='Search']") WebElement searchButton;
	@FindBy(xpath = "//span[text()='Club Mahindra Madikeri, Coorg']") WebElement Inputvalue;
	public HomePage(){
		PageFactory.initElements(Data.driver, this);
	}
	public boolean validate_homePage() {
		return HomepageLogo.isDisplayed();	
    }
	public void navigate_to_resultsPage() {
		EventMethods.clickElement(searchButton);
		Actions act= new Actions(Data.driver);
		act.sendKeys("club mahindra",Keys.ENTER).build().perform();
}
     
   
    
    
    
    
	
	
	
	

}
