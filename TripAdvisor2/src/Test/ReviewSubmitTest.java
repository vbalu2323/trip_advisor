package Test;

import org.testng.annotations.Test;

import pages.ReviewSubmitPage;

public class ReviewSubmitTest extends ResultPageTest {
	ReviewSubmitPage rsp;
	@Test(priority = 9)
	public void review() {
		rsp=new ReviewSubmitPage();
		rsp.review();
	}
	@Test(priority = 10)
	public void move_to_hotelRatings() {
		rsp.move_to_hotel_ratings();
	}@Test(priority = 11)
	public void ratings_for_hotel_ratings() throws Exception {
		rsp.ratings_to_hotel();
	}
	@Test(priority = 12)
	public void move_to_submitButton() {
		rsp.move_to_submitButton();
	}
}
