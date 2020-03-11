package step_defination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Loginstepdefination {
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://crmpro.com");
	    
	}

	@When("^title of login page is free crm$")
	public void title_of_login_page_is_free_crm() {
		String title=driver.getTitle();
		System.out.println(title);  
	}

	@And("^user enter username and password$")
	public void user_enter_username_and_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sudhananda123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@1234");
		
	}

	@And("^user click on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		   
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title=driver.getTitle();
		System.out.println("homepage title::" +title);
		Assert.assertEquals("CRMPRO", title);
	   
	}

}
