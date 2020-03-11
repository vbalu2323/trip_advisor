package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.CommonMethods;
import framework.Data;

import framework.configMethods;
import pages.HomePage;

public class HomePageTest extends configMethods{
	HomePage hm;
	//@Parameters({"browser","url"})

	@Test(priority = 1)
	public void navigate_to_homePage() {
		Data.logger.info("Launching the browser");
		CommonMethods.launchApplication("chrome","https://tripadvisor.in/");
		Data.logger.info("Application is launched");
		hm=new HomePage();
	}
	@Test(priority = 2)
	public void validate_homePage() {
		Data.logger.trace("Validating the home page title");
		boolean flag=hm.validate_homePage();
		Assert.assertTrue(flag);
		Data.logger.trace("Home page title is validated");
	}
	@Test(priority = 3)
	public void navigate_to_resultPage() {
		Data.logger.trace("Navigating to the Result Page");
		hm.navigate_to_resultsPage();
		Data.logger.trace("Navigated to Result Page");
	}
}
