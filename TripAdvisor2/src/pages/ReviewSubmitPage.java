package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import framework.Data;
import framework.EventMethods;

public class ReviewSubmitPage {
	@FindBy(id = "bubble_rating") WebElement reviewRating;
	@FindBy(id = "ReviewTitle") WebElement reviewTitle;
	@FindBy(id = "ReviewText") WebElement textReview;
	@FindBy(xpath = "(//div[@class='question '])[6]") WebElement hotelRatings;
	@FindBy(id = "qid12_bubbles") WebElement service;
	@FindBy(id = "qid14_bubbles") WebElement cleanliness;
	@FindBy(id = "qid11_bubbles") WebElement rooms;
	@FindBy(id = "SUBMIT") WebElement submitButton;
	public ReviewSubmitPage() {
		PageFactory.initElements(Data.driver, this);
	}
	public void review() {
		EventMethods.move_to_element_with_offset(reviewRating, 75, 0);
		EventMethods.Enter_value(reviewTitle, "Nice");
		EventMethods.Enter_value(textReview, "very nice");
	}
	public void move_to_hotel_ratings() {
		EventMethods.scrollTOElement(hotelRatings);
	}
	public void ratings_to_hotel() throws Exception {
		EventMethods.move_to_element_with_offset(service, 40, 0);
		Thread.sleep(3000);
		EventMethods.move_to_element_with_offset(cleanliness, 40, 0);
		Thread.sleep(3000);
		EventMethods.move_to_element_with_offset(rooms, 40, 0);
	}	
	public void move_to_submitButton() {
		EventMethods.scrollTOElement(submitButton);
	}
}