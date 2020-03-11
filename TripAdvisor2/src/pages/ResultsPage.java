package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.Data;
import framework.EventMethods;

public class ResultsPage  {
	@FindBy(xpath = "//span[text()='Club Mahindra Madikeri, Coorg']")WebElement resultLink;
	@FindBy(xpath ="//span[@class='ui_icon lightbulb-on hotels-community-"
			+ "content-common-TabAboveHeader__icon--z0-Ex']") WebElement move_to_review_link;
	@FindBy(xpath = "//a[text()='Write a review']") WebElement reviewLink;
	public ResultsPage() {
		PageFactory.initElements(Data.driver, this);
	}
	public void click_on_resultLink() {
		EventMethods.clickElement(resultLink);
	}
	public String navigate_to_reviewPage() {
		return Data.driver.getTitle();
	}
	public void move_to_reviewLink() {
		EventMethods.switch_to_new_window();
		EventMethods.scrollTOElement(move_to_review_link);
	}
	public void click_on_reviewLink() {
		EventMethods.clickElement(reviewLink);
	}
	public String navigate_to_submit_review_page() {
		EventMethods.switch_to_new_window();
		return Data.driver.getTitle();
	}
}
