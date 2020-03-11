package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ResultsPage;



public class ResultPageTest extends HomePageTest {
	ResultsPage rp;
	@Test(priority = 4)
	public void enteringInputInSearch() {
	rp=new ResultsPage();
	rp.click_on_resultLink();
	}
	@Test(priority = 5)
	public void navigate_to_reviewPage() {
		String title=rp.navigate_to_reviewPage();
		System.out.println(title);
		//Assert.assertEquals(title, "club mahindra - TripAdvisor");
	}
	@Test(priority = 6)
	public void move_on_reviewLink() {
		rp.move_to_reviewLink();
	}
	@Test(priority = 7)
	public void click_on_reviewLink() {
		rp.click_on_reviewLink();
	}
	@Test(priority = 8)
	public void navigate_to_submit_review() {
		String title=rp.navigate_to_submit_review_page();
		System.out.println(title);
	}
}
